package com.pwm.community.services;

import com.pwm.community.components.SmsComponent;
import com.pwm.community.entities.member.ContactAuthEntity;
import com.pwm.community.entities.member.UserEntity;
import com.pwm.community.enums.CommonResult;
import com.pwm.community.exceptions.RollbackException;
import com.pwm.community.interfaces.IResult;
import com.pwm.community.mappers.IMemberMapper;
import com.pwm.community.regex.MemberRegex;
import com.pwm.community.utils.CryptoUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

@Service(value = "com.pwm.community.services.MemberService")
public class MemberService {
    private final IMemberMapper memberMapper;

    private final SmsComponent smsComponent;

    @Autowired
    public MemberService(IMemberMapper memberMapper, SmsComponent smsComponent) {
        this.memberMapper = memberMapper;
        this.smsComponent = smsComponent;
    }

    @Transactional
    protected IResult createContactAuth(ContactAuthEntity contactAuth) throws
            RollbackException,
            NoSuchAlgorithmException,
            IOException,
            InvalidKeyException {
        if (contactAuth.getContact() == null || !contactAuth.getContact().matches(MemberRegex.USER_CONTACT)) {
            return CommonResult.FAILURE;
        }
        Date createdAt = new Date();
        Date expiresAt = DateUtils.addMinutes(createdAt, 5);
        String code = RandomStringUtils.randomNumeric(6);
        String salt = CryptoUtils.hashSha512(String.format("%s%s%d%f%f",
                contactAuth.getContact(),
                code,
                createdAt.getTime(),
                Math.random(),
                Math.random()));
        contactAuth.setCode(code)
                .setSalt(salt)
                .setCreatedAt(createdAt)
                .setExpiresAt(expiresAt)
                .setExpired(false);
        if (this.memberMapper.insertContactAuth(contactAuth) == 0) {
            throw new RollbackException();
        }
        String smsContent = String.format("[독후감 사이트!] 인증번호 [%s]를 입력해 주세요.", contactAuth.getCode());
        if (this.smsComponent.send(contactAuth.getContact(), smsContent) != 202) {
            throw new RollbackException();
        }
        return CommonResult.SUCCESS;
    }
    @Transactional
    public CommonResult createUser(ContactAuthEntity contactAuth, UserEntity user) throws
            RollbackException {
        if (contactAuth.getContact() == null ||
                contactAuth.getCode() == null ||
                contactAuth.getSalt() == null ||
                !contactAuth.getContact().matches(MemberRegex.USER_CONTACT) ||
                !contactAuth.getCode().matches(MemberRegex.CONTACT_AUTH_CODE) ||
                !contactAuth.getSalt().matches(MemberRegex.CONTACT_AUTH_SALT)) {
            return CommonResult.FAILURE;
        }
        contactAuth = this.memberMapper.selectContactAuthByContactCodeSalt(contactAuth);
        if (contactAuth == null || !contactAuth.isExpired()) {
            return CommonResult.FAILURE;
        }
        if (user.getEmail() == null ||
                user.getPassword() == null ||
                user.getName() == null ||
                user.getContact() == null ||
                !user.getEmail().matches(MemberRegex.USER_EMAIL) ||
                !user.getPassword().matches(MemberRegex.USER_PASSWORD) ||
                !user.getName().matches(MemberRegex.USER_NAME) ||
                !user.getContact().matches(MemberRegex.USER_CONTACT)) {
            return CommonResult.FAILURE;
        }
        user.setPassword(CryptoUtils.hashSha512(user.getPassword()));
        if (this.memberMapper.insertUser(user) == 0) {
            throw new RollbackException();
        }
        return CommonResult.SUCCESS;
    }
}
