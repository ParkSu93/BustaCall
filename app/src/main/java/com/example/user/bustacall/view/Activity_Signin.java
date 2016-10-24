package com.example.user.bustacall.view;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.user.bustacall.R;
import com.example.user.bustacall.presenter.Activtiy_Signin_Presenter;

/**회원가입 페이지
 * Created by user on 2016-10-09.
 */
public class Activity_Signin extends BaseActivity implements View.OnClickListener{

    TextView tv_overlap,tv_request,tv_login;
    EditText et_nickname,et_phonenum,et_requestnum;
    boolean is_nickname,is_phonenum,is_requestnum;
    Activtiy_Signin_Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        set_Values();
    }

    public void set_Values(){
        set_Weight();
        presenter = new Activtiy_Signin_Presenter(this);

    }

    public void set_Weight(){
        tv_login = (TextView)findViewById(R.id.activity_signin_tv_login);
        tv_overlap = (TextView)findViewById(R.id.activity_signin_tv_overlap);
        tv_request = (TextView)findViewById(R.id.activity_signin_tv_phonerequest);
        et_nickname = (EditText)findViewById(R.id.activtiy_signin_et_nickname);
        et_phonenum = (EditText)findViewById(R.id.activtiy_signin_et_phonenum);
        et_requestnum = (EditText)findViewById(R.id.activtiy_signin_et_request_answer);
        tv_login.setOnClickListener(this);
        tv_overlap.setOnClickListener(this);
        tv_request.setOnClickListener(this);
        et_nickname.addTextChangedListener(tw_nickname);
        et_phonenum.addTextChangedListener(tw_phonenum);
        et_requestnum.addTextChangedListener(tw_requestnum);
    }

    @Override
    public void onClick(View v) {
        if(is_nickname==true){
            presenter.getis_nickname(et_nickname.getText().toString());
        }
        if(is_phonenum==true){
            presenter.getis_phonenum(et_phonenum.getText().toString());
        }
        if(is_phonenum==true && is_nickname==true && is_requestnum==true){
            Intent intent = new Intent(this,Activity_Main.class);
            startActivity(intent);
        }
    }

    public boolean is_nickname() {
        return is_nickname;
    }

    public void setIs_nickname(boolean is_nickname) {
        this.is_nickname = is_nickname;
    }

    public boolean is_phonenum() {
        return is_phonenum;
    }

    public void setIs_phonenum(boolean is_phonenum) {
        this.is_phonenum = is_phonenum;
    }

    public boolean is_requestnum() {
        return is_requestnum;
    }

    public void setIs_requestnum(boolean is_requestnum) {
        this.is_requestnum = is_requestnum;
    }

    public TextView getTv_overlap() {
        return tv_overlap;
    }

    public TextView getTv_request() {
        return tv_request;
    }

    public TextView getTv_login() {
        return tv_login;
    }

    TextWatcher tw_nickname = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            presenter.getis_nickname(et_nickname.getText().toString());
            checkTrueofLogin();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
    TextWatcher tw_phonenum = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            presenter.getis_phonenum(et_phonenum.getText().toString());
            checkTrueofLogin();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    TextWatcher tw_requestnum = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            presenter.getis_requestnum(et_requestnum.getText().toString());
            checkTrueofLogin();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    public void checkTrueofLogin(){
        if(is_requestnum==true&&is_nickname==true&&is_phonenum==true){
            setEnableTextView(tv_login,true);
        }
    }
}
