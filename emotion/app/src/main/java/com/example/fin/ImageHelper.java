package com.example.fin;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.telephony.IccOpenLogicalChannelResponse;

import com.microsoft.projectoxford.emotion.contract.FaceRectangle;
public class ImageHelper {
    public static Bitmap drawRectOnBitmap(Bitmap mBitmap, FaceRectangle faceRectangle,String status)
    {
        Bitmap bitmap = mBitmap.copy(Bitmap.Config.ARGB_8888,true);
        Canvas canvas = new Canvas(bitmap);

        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(12);

        canvas.drawRect(faceRectangle.left,
                faceRectangle.top,
                faceRectangle.left+faceRectangle.width,
                faceRectangle.top+faceRectangle.height,
                paint);
        int cX = faceRectangle.left+faceRectangle.width;
        int cY = faceRectangle.top+faceRectangle.height;

        drawRectOnBitmap(canvas,100,cX/2+cX/5,cY+100,Color.WHITE,status);
        return bitmap;

    }

    private static void drawRectOnBitmap(Canvas canvas, int i, int i1, int i2, int white, String status) {
        Paint tempTextPaint = new Paint();
        tempTextPaint.setAntiAlias(true);
        tempTextPaint.setStyle(Paint.Style.FILL);
        tempTextPaint.setColor(color);
        tempTextPaint.setTextSize(textSize);

        canvas.drawText(status,cX,cY,tempTextPaint);


    }
}