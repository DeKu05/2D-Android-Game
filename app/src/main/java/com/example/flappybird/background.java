package com.example.flappybird;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;

public class background {
    int x=0 , y=0 ;
    Bitmap background;

    background (int screnX, int screenY, Resources res){
        background = BitmapFactory.decodeResource(res,R.drawable.no);
        background = Bitmap.createScaledBitmap(background, screnX,screenY, false);

    }
}
