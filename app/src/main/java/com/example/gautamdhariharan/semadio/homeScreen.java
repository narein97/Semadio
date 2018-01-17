package com.example.gautamdhariharan.semadio;


import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.LinearLayout;
import android.widget.TextView;



public class homeScreen extends AppCompatActivity {


    private LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        home_setup();
    }

    void home_setup(){
        ScreenParam sp = new ScreenParam();
        int width = sp.getScreenWidth(homeScreen.this);
        int height = sp.getScreenHeight(homeScreen.this);
        TextView text;
        int height_ad,height_vid;
        if(this.getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT){
            height_ad=(int)(height/2.5);
            height_vid=height/3;
            width= width*3/4;
        }
        else{
            height_ad= (int) (height/1.8);
            height_vid=(height/2);
            width=width*3/4;
        }
        ll=(LinearLayout)findViewById(R.id.adll);
        for(int j=0;j<ll.getChildCount();j++){
            text = (TextView)ll.getChildAt(j);
            text.setWidth(width);
            text.setHeight(height_ad);
        }
        ll=(LinearLayout)findViewById(R.id.engll);
        for(int j=0;j<ll.getChildCount();j++){
            text = (TextView)ll.getChildAt(j);
            text.setWidth(width);
            text.setHeight(height_vid);
        }
        ll=(LinearLayout)findViewById(R.id.hinll);
        for(int j=0;j<ll.getChildCount();j++){
            text = (TextView)ll.getChildAt(j);
            text.setWidth(width);
            text.setHeight(height_vid);
        }
        ll=(LinearLayout)findViewById(R.id.tamll);
        for(int j=0;j<ll.getChildCount();j++){
            text = (TextView)ll.getChildAt(j);
            text.setWidth(width);
            text.setHeight(height_vid);
        }
        ll=(LinearLayout)findViewById(R.id.mpll);
        for(int j=0;j<ll.getChildCount();j++){
            text = (TextView)ll.getChildAt(j);
            text.setWidth(width);
            text.setHeight(height_vid);
        }
        ll=(LinearLayout)findViewById(R.id.telll);
        for(int j=0;j<ll.getChildCount();j++){
            text = (TextView)ll.getChildAt(j);
            text.setWidth(width);
            text.setHeight(height_vid);
        }
        text = (TextView)findViewById(R.id.mostviewed);
        text.setHeight(height/5);
        text = (TextView)findViewById(R.id.english);
        text.setHeight(height/5);
        text = (TextView)findViewById(R.id.hindi);
        text.setHeight(height/5);
        text = (TextView)findViewById(R.id.tamil);
        text.setHeight(height/5);
        text = (TextView)findViewById(R.id.kannada);
        text.setHeight(height/5);
        text = (TextView)findViewById(R.id.uploaderD);
        text.setHeight(height/5);


    }

    public void click(View v){
        Intent i = new Intent(this,video.class);
        startActivity(i);
    }
    public void upd(View v){
        Intent i=new Intent(this, uploaderDash.class);
        startActivity(i);
    }


}
