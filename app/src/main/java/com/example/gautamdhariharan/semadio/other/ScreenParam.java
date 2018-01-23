package com.example.gautamdhariharan.semadio.other;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/**
 * Created by narein on 15/1/18.
 */

public class ScreenParam {
    WindowManager screen;

    public int getScreenWidth(Context context){
        screen = (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        screen.getDefaultDisplay().getMetrics(dm);
        return dm.widthPixels;
    }

    public int getScreenHeight(Context context){
        screen = (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        screen.getDefaultDisplay().getMetrics(dm);
        return dm.heightPixels;
    }
}
