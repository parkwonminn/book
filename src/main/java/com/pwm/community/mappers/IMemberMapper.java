package com.pwm.community.mappers;

import com.pwm.community.entities.member.ContactAuthEntity;
import com.pwm.community.entities.member.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IMemberMapper {

    int insertContactAuth(ContactAuthEntity contactAuth);

    int insertUser(UserEntity user);

    ContactAuthEntity selectContactAuthByContactCodeSalt(ContactAuthEntity contactAuth);
}
