package com.example.figuras;

import android.view.View;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;

public class Figura extends View {
    private int lados = 0;

    public Figura(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        if (lados < 3)
            return;
        int width = getWidth();
        int height = getHeight();
        Paint paint = new Paint();
        paint.setColor(Color.rgb(255,128,0));
        paint.setStyle(Paint.Style.FILL);

        float centerX = width / 2;
        float centerY = height / 2;
        float radius = Math.min(centerX, centerY) - 30;
        Path path = new Path();
        for (int i = 0; i < lados; i++) {
            float x = (float) (centerX + radius * Math.cos(2 * Math.PI * i / lados));
            float y = (float) (centerY + radius * Math.sin(2 * Math.PI * i / lados));
            if (i == 0) {
                path.moveTo(x, y);
            } else {
                path.lineTo(x, y);
            }
        }
        path.close();
        canvas.drawPath(path, paint);
    }

    public void setSides(int sides) {
        this.lados = sides;
        invalidate();
    }

}
