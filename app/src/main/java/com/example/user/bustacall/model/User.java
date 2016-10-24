package com.example.user.bustacall.model;

/**
 * Created by user on 2016-10-23.
 */
public class User {

    String nickname;
    String phoneNum;

    public User(){}

    public User(String nickname,String phoneNum){
        this.nickname = nickname; this.phoneNum = phoneNum;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

}
