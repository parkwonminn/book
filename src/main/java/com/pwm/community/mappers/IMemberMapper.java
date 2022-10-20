package com.pwm.community.mappers;

import com.pwm.community.entities.member.ContactAuthEntity;
import com.pwm.community.entities.member.UsersEntity;

public interface IMemberMapper {

    int insertContactAuth(ContactAuthEntity contactAuth);

    int insertUser(UsersEntity user);
}
