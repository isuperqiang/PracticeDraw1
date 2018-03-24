package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    private int mWidth;
    private int mHeight;
    private Paint mPaintLine;
    private Paint mPaintBar;
    private Paint mPaintText;

    private static final String ANDTEXT[] = {
            "Froyo", "GB", "ICS", "JB", "KitKat", "L", "M"
    };

    public Practice10HistogramView(Context context) {
        super(context);
        initPaint();
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }

    private void initPaint() {
        mPaintLine = new Paint();
        mPaintLine.setAntiAlias(true);
        mPaintLine.setStyle(Paint.Style.STROKE);
        mPaintLine.setColor(Color.WHITE);
        mPaintLine.setStrokeWidth(2);

        mPaintText = new Paint();
        mPaintText.setAntiAlias(true);
        mPaintText.setStyle(Paint.Style.FILL);
        mPaintText.setColor(Color.WHITE);
        mPaintText.setTextSize(32);

        mPaintBar = new Paint();
        mPaintBar.setAntiAlias(true);
        mPaintBar.setStyle(Paint.Style.FILL);
        mPaintBar.setColor(Color.GREEN);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //        综合练习
        //        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        // 居中
        canvas.drawText("直方图", mWidth / 2 - 48, 460, mPaintText);
        // 70+10
        canvas.drawRect(60, 398, 130, 400, mPaintBar);
        canvas.drawRect(140, 380, 210, 400, mPaintBar);
        canvas.drawRect(220, 380, 290, 400, mPaintBar);
        canvas.drawRect(300, 280, 370, 400, mPaintBar);
        canvas.drawRect(380, 180, 450, 400, mPaintBar);
        canvas.drawRect(460, 120, 530, 400, mPaintBar);
        canvas.drawRect(540, 300, 610, 400, mPaintBar);

        mPaintText.setStrokeWidth(1);
        mPaintText.setTextSize(24);
        // 居中对齐
        mPaintText.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(ANDTEXT[0], 95, 424, mPaintText);
        canvas.drawText(ANDTEXT[1], 175, 424, mPaintText);
        canvas.drawText(ANDTEXT[2], 255, 424, mPaintText);
        canvas.drawText(ANDTEXT[3], 335, 424, mPaintText);
        canvas.drawText(ANDTEXT[4], 415, 424, mPaintText);
        canvas.drawText(ANDTEXT[5], 495, 424, mPaintText);
        canvas.drawText(ANDTEXT[6], 575, 424, mPaintText);

        canvas.drawLine(50, 20, 50, 400, mPaintLine);
        canvas.drawLine(50, 400, 650, 400, mPaintLine);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = w;
        mHeight = h;
    }
}
