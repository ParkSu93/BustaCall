package com.example.user.bustacall.view;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.user.bustacall.R;

/**엑티비티 메인 페이지
 * Created by user on 2016-10-09.
 */
public class Activity_Main extends BaseActivity implements View.OnClickListener{

    LinearLayout ll_goandback,ll_go;
    TextView tv_reservationbus,tv_reservationto,tv_goandback,tv_go;
    ImageView iv_goandback_image,iv_go_image,iv_goandback_checkpoint,iv_go_checkpoint;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        set_Weight();
        set_Values();
    }

    public void set_Values(){
        tv_goandback.setTextColor(getResources().getColor(R.color.colorPrimary));
        tv_go.setTextColor(getResources().getColor(R.color.colorPrimaryGray));
        ll_goandback.setBackgroundColor(getResources().getColor(R.color.AppColorWhite));
        ll_go.setBackgroundColor(getResources().getColor(R.color.AppColorLightGray));
        iv_goandback_checkpoint.setImageResource(R.drawable.checkpoint);
        iv_go_checkpoint.setVisibility(View.INVISIBLE);


    }

    public void set_Weight(){
        ll_goandback = (LinearLayout)findViewById(R.id.whitetitlebar_main_ll_goandback);
        ll_go = (LinearLayout)findViewById(R.id.whitetitlebar_main_ll_go);
        tv_go = (TextView)findViewById(R.id.whitetitlebar_main_tv_go_text);
        tv_goandback = (TextView)findViewById(R.id.whitetitlebar_main_tv_goandback_text);
        iv_goandback_image = (ImageView)findViewById(R.id.whitetitlebar_main_iv_goandback_image);
        iv_go_image = (ImageView)findViewById(R.id.whitetitlebar_main_iv_go_image);
        iv_go_checkpoint = (ImageView)findViewById(R.id.whitetitlebar_main_iv_go_checkpoint);
        iv_goandback_checkpoint =(ImageView)findViewById(R.id.whitetitlebar_main_iv_goandback_checkpoint);
        ll_go.setOnClickListener(this);
        ll_goandback.setOnClickListener(this);
    }

    public void onClick_menu(View v){
        //TODO 네비게이션
    }

    public void onClick_reservationBus(View v){}
    public void onClick_reservationTo(View v){}

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.whitetitlebar_main_ll_go){//편도
            tv_go.setTextColor(getResources().getColor(R.color.colorPrimary));
            tv_goandback.setTextColor(getResources().getColor(R.color.colorPrimaryGray));
            ll_go.setBackgroundColor(getResources().getColor(R.color.AppColorWhite));
            ll_goandback.setBackgroundColor(getResources().getColor(R.color.AppColorLightGray));
            iv_go_checkpoint.setImageResource(R.drawable.checkpoint);
            iv_goandback_checkpoint.setVisibility(View.INVISIBLE);
            iv_go_image.setImageResource(R.drawable.go_blue);
            iv_go_checkpoint.setVisibility(View.VISIBLE);
            iv_goandback_image.setImageResource(R.drawable.goandback_white);
        }else{//왕복
            tv_go.setTextColor(getResources().getColor(R.color.colorPrimaryGray));
            tv_goandback.setTextColor(getResources().getColor(R.color.colorPrimary));
            ll_goandback.setBackgroundColor(getResources().getColor(R.color.AppColorWhite));
            ll_go.setBackgroundColor(getResources().getColor(R.color.AppColorLightGray));
            iv_goandback_checkpoint.setImageResource(R.drawable.checkpoint);
            iv_go_checkpoint.setVisibility(View.INVISIBLE);
            iv_go_image.setImageResource(R.drawable.go_white);
            iv_goandback_image.setImageResource(R.drawable.goandback_blue);
            iv_goandback_checkpoint.setVisibility(View.VISIBLE);
        }
    }
}
