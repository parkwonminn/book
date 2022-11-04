package com.pwm.community.entities.member;

import java.util.Objects;

public class UserEntity {
    public static final String ATTRIBUTE_NAME = "memberUser";
    public static final String ATTRIBUTE_NAME_PLURAL = "memberUsers";

    public static UserEntity build() {return new UserEntity();}

    private String email;
    private String password;
    private String name;
    private String contact;
    private String statusValue;
    private String nickname;
    private boolean isAdmin= false;

    public UserEntity() {
    }

    public UserEntity(String email, String password, String name, String contact, String statusValue, String nickname, boolean isAdmin) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.contact = contact;
        this.statusValue = statusValue;
        this.nickname = nickname;
        this.isAdmin = isAdmin;
    }

    public String getEmail() {
        return email;
    }

    public UserEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getContact() {
        return contact;
    }

    public UserEntity setContact(String contact) {
        this.contact = contact;
        return this;
    }

    public String getStatusValue() {
        return statusValue;
    }

    public UserEntity setStatusValue(String statusValue) {
        this.statusValue = statusValue;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public UserEntity setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public UserEntity setAdmin(boolean admin) {
        isAdmin = admin;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}
