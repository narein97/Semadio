package com.example.gautamdhariharan.semadio.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.gautamdhariharan.semadio.R;
import com.example.gautamdhariharan.semadio.other.ScreenParam;

public class video extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        ScreenParam sp = new ScreenParam();
        int height=sp.getScreenHeight(this);
        TextView textView = (TextView)findViewById(R.id.video);
        textView.setHeight(height/2);
        textView = (TextView)findViewById(R.id.suggestion1);
        textView.setHeight(height/3);
        textView = (TextView)findViewById(R.id.suggestion2);
        textView.setHeight(height/3);
        textView = (TextView)findViewById(R.id.suggestion3);
        textView.setHeight(height/3);
        textView = (TextView)findViewById(R.id.suggestion4);
        textView.setHeight(height/3);
    }
}
