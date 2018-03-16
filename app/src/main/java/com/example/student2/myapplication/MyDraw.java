package com.example.student2.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;


/**
 * Created by student2 on 16.03.18.
 */

public class MyDraw extends View {

    public MyDraw(Context context) {
        super(context);
    }


    Paint p = new Paint();
    
    void mydraw(Canvas canvas, float x, float y, float r, p) {
        canvas.drawCircle(x, y, r, p);

        if (r > 10) {

            mydraw(canvas, x - r, y, r/2);
            mydraw(canvas, x + r, y, r/2);
            mydraw(canvas, x, y - r, r/2);
            mydraw(canvas, x, y + r, r/2);

        }
    }
}