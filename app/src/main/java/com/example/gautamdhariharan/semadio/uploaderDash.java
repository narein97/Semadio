package com.example.gautamdhariharan.semadio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class uploaderDash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uploader_dash);
        ScreenParam sp = new ScreenParam();
        int height=sp.getScreenHeight(this);
        TextView textView = (TextView)findViewById(R.id.dasht);
        textView.setHeight(height/6);
        textView = (TextView)findViewById(R.id.welct);
        textView.setHeight(height/8);
        textView = (TextView)findViewById(R.id.stats);
        textView.setHeight(height/8);
        Button b=(Button) findViewById(R.id.uploadb);
        b.setHeight(height/6);
        textView = (TextView)findViewById(R.id.numt);
        textView.setHeight(height/12);
        textView = (TextView)findViewById(R.id.vit);
        textView.setHeight(height/12);
        textView = (TextView)findViewById(R.id.nol);
        textView.setHeight(height/12);
        textView = (TextView)findViewById(R.id.vid1);
        textView.setHeight(height/3);
        textView = (TextView)findViewById(R.id.vid2);
        textView.setHeight(height/3);
        textView = (TextView)findViewById(R.id.vid3);
        textView.setHeight(height/3);
        Button upl=(Button) findViewById(R.id.uploadb);

    }
    public void uploadS(View v){
        Intent i= new Intent(this, uploaderScreen.class);
        startActivity(i);
    }

}
