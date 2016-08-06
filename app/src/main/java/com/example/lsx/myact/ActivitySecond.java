package com.example.lsx.myact;

import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;


/**
 * Created by lsx on 2016/7/22.
 */
public class ActivitySecond extends AppCompatActivity {
    private static final String TAG2 = "ActivitySecond";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG2, "onCreate: 执行了");
        }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG2, "onStart:执行了");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG2, "onResume: 执行了");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG2, "onPause: 执行了");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG2, "onStop: 执行了");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG2, "onDestroy: 执行了");
    }


}
