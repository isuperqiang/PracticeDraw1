package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    private int mWidth;
    private int mHeight;
    private Paint mPaint1;
    private Paint mPaint2;
    private Paint mPaint3;
    private Paint mPaint4;

    public Practice2DrawCircleView(Context context) {
        super(context);
        initPaint();
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }

    private void initPaint() {
        mPaint1 = new Paint();
        mPaint1.setAntiAlias(true);
        mPaint1.setStyle(Paint.Style.FILL);
        mPaint1.setColor(Color.BLACK);

        mPaint2 = new Paint();
        mPaint2.setColor(Color.BLACK);
        mPaint2.setAntiAlias(true);
        mPaint2.setStyle(Paint.Style.STROKE);
        mPaint2.setStrokeWidth(2);

        mPaint3 = new Paint();
        mPaint3.setAntiAlias(true);
        mPaint3.setStyle(Paint.Style.FILL);
        mPaint3.setColor(Color.BLUE);

        mPaint4 = new Paint();
        mPaint4.setAntiAlias(true);
        mPaint4.setColor(Color.BLACK);
        mPaint4.setStyle(Paint.Style.STROKE);
        mPaint4.setStrokeWidth(30);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //        练习内容：使用 canvas.drawCircle() 方法画圆
        //        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆

        int radius = 100;
        int left = mWidth / 2 - 120;
        int top1 = radius + 10;
        canvas.drawCircle(left, top1, radius, mPaint1);

        int right = mWidth / 2 + 120;
        canvas.drawCircle(right, top1, radius, mPaint2);

        int top2 = radius * 2 + 140;
        canvas.drawCircle(left, top2, radius, mPaint3);

        canvas.drawCircle(right, top2, radius + 10, mPaint4);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = w;
        mHeight = h;
    }
}
