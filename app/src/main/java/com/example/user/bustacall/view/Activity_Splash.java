package com.example.user.bustacall.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.user.bustacall.R;

/**
 * Created by user on 2016-10-09.
 */
public class Activity_Splash extends BaseActivity implements View.OnClickListener{
    Button bt_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    public void set_Values(){

    }

    public void set_Weight(){
        bt_login = (Button)findViewById(R.id.activity_splash_bt_login);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.activity_splash_bt_login){
            Intent intent = new Intent(this,Activity_Signin.class);
            startActivity(intent);
        }
    }
}
