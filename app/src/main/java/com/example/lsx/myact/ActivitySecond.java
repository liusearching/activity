package com.example.lsx.myact;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;


/**
 * Created by lsx on 2016/7/22.
 */
public class ActivitySecond extends AppCompatActivity {


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ActivitySecond", "ER执行了");
    }
}
