package com.example.user.bustacall.view;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.widget.TextView;

import com.example.user.bustacall.R;


/**
 * Created by lee on 2016-09-11.
 */
public class BaseActivity extends Activity {

    public void onClick_backButton(View v)
    {
        finish();
    }

    public void setEnableTextView(TextView tv, boolean b) {
        if (b) {
            tv.setEnabled(true);
            tv.setBackgroundResource(R.drawable.roundbutton_blue);
            tv.setTextColor(Color.parseColor("#FFFFFF"));
        } else {
            tv.setEnabled(false);
            tv.setBackgroundResource(R.drawable.roundbutton_gray);
            final int version = Build.VERSION.SDK_INT;
            if (version >= Build.VERSION_CODES.M) {
                tv.setTextColor(getColor(R.color.AppColorGray));
            } else {
                tv.setTextColor(getResources().getColor(R.color.AppColorGray));
            }
        }
    }
}
