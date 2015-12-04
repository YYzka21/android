package com.example.asus.newapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by asus on 2015/12/2.
 */
public class FirstActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Button button1 =(Button)findViewById(R.id.button1);
        Button button2 =(Button)findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
                                           startActivity(intent);
                                       }
                                   }

        );
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FirstActivity.this,"系统维护中，不提供服务",Toast.LENGTH_SHORT).show();

            }
        });
    }

}


