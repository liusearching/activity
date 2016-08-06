package com.example.lsx.myact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityThird extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_third);
        Button button = (Button) findViewById(R.id.third_button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ActivityThird.this,MainActivity.class);
                //startActivity(intent);
                intent.putExtra("thirdback","3333333333");
                setResult(RESULT_OK, intent);
                finish();
            }
        });

    }
}
