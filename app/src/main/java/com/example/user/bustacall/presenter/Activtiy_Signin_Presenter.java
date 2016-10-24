package com.example.user.bustacall.presenter;

import android.content.Context;

import com.example.user.bustacall.view.Activity_Signin;

/**
 * Created by user on 2016-10-23.
 */
public class Activtiy_Signin_Presenter {
    Activity_Signin view;

    public Activtiy_Signin_Presenter(Activity_Signin view){
        this.view = view;
    }

    public void getis_nickname(String str){
        if(str.equals("")){
            view.setIs_nickname(false);
        }else{
            view.setIs_nickname(true);
            view.setEnableTextView(view.getTv_overlap(),true);
        }
    }

    public void getis_phonenum(String str){
        if(str.equals(""))
        {
            view.setIs_phonenum(false);
        }else{
            view.setIs_phonenum(true);
            view.setEnableTextView(view.getTv_request(),true);
        }
    }

    public void getis_requestnum(String str){
        if(str.equals(""))
        {
            view.setIs_requestnum(false);
        }else{
            view.setIs_requestnum(true);
        }
    }

    public void request_overlap(String str){
        //TODO 통신 통해서 중복확인
    }

    public void request_requestNum(String str){
        //TODO 통신 통해서 인증 번호 입력
    }
}
