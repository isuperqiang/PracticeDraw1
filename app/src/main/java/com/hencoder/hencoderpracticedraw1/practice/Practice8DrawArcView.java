package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    private Paint mPaint1;
    private Paint mPaint2;

    public Practice8DrawArcView(Context context) {
        super(context);
        initPaint();
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }

    private void initPaint(){
        mPaint1 = new Paint();
        mPaint1.setAntiAlias(true);
        mPaint1.setStyle(Paint.Style.STROKE);
        mPaint1.setColor(Color.BLACK);
        mPaint1.setStrokeWidth(4);

        mPaint2 = new Paint();
        mPaint2.setAntiAlias(true);
        mPaint2.setColor(Color.BLACK);
        mPaint2.setStyle(Paint.Style.FILL);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        RectF rectF1 = new RectF(200,100, 400, 300);
        canvas.drawArc(rectF1, -180, 90, false, mPaint1);

        RectF rectF2 = new RectF(400, 100, 600, 300);
        canvas.drawArc(rectF2, -135, 135, true, mPaint2);

        RectF rectF3 = new RectF(200, 100, 500, 300);
        canvas.drawArc(rectF3, 0, 180, true, mPaint2);
    }

}
