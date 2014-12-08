package com.atos.noreturns_9.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

public class CircularPercentageView {

	public Bitmap circularImageBar(float i) {

		Bitmap b = Bitmap.createBitmap(300, 300, Bitmap.Config.ARGB_8888);
		Canvas canvas = new Canvas(b);
		Paint paint = new Paint();

		paint.setColor(Color.parseColor("#c4c4c4"));
		paint.setStrokeWidth(30);
		paint.setStyle(Paint.Style.STROKE);
		canvas.drawCircle(150, 150, 140, paint);
		paint.setColor(Color.parseColor(#FA5858));
		paint.setStrokeWidth(5);
		paint.setStyle(Paint.Style.FILL);
		final RectF oval = new RectF();
		paint.setStyle(Paint.Style.STROKE);
		oval.set(10, 10, 290, 290);
		canvas.drawArc(oval, 270, ((i * 360) / 100), false, paint);
		return b;
	}
}
