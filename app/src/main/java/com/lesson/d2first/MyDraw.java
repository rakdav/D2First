package com.lesson.d2first;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyDraw extends View {
    public MyDraw(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawPaint(paint);
        paint.setAntiAlias(true);
        paint.setColor(Color.WHITE);
        canvas.drawCircle(getWidth()/2,
                getHeight()/2,100,paint);
        paint.setColor(Color.GREEN);
        canvas.drawRect(0,0,
                300,200,paint);
        paint.setColor(Color.BLUE);
        paint.setTextSize(80);
        paint.setSubpixelText(true);
        float rotate_center_x = 200; //центр поворота холста по оси X
        float rotate_center_y = 200; // центр поворота холста по оси Y
        float rotate_angle = 45; //угол поворота
        canvas.rotate(-rotate_angle,
                rotate_center_x, rotate_center_y);
        canvas.drawText("Samsung IT school",
                50, 400, paint);
        Bitmap image= BitmapFactory.decodeResource(getResources(),
                R.drawable.dice5);
        canvas.drawBitmap(image,400,600,paint);
    }
}
