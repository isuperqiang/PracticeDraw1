package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {
    private Paint mPaint;
    private int mWidth;
    private int mHeight;
    private Path mPath;

    public Practice9DrawPathView(Context context) {
        super(context);
        initPaint();
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }

    private void initPaint() {
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.BLACK);
        mPaint.setAntiAlias(true);

        mPath = new Path();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //        练习内容：使用 canvas.drawPath() 方法画心形

        // 上面两个 3/4 圆，下面用直线围起来就行了
        mPath.moveTo(mWidth / 2, 200);
        mPath.arcTo(mWidth / 2, 100, mWidth / 2 + 200, 300, -180, 225, true);
        mPath.lineTo(mWidth / 2, 440);
        mPath.lineTo((float) (mWidth / 2 - 170.72), (float) 270.72);
        mPath.arcTo(mWidth / 2 - 200, 100, mWidth / 2, 300, 135, 225, true);

        canvas.drawPath(mPath, mPaint);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = w;
        mHeight = h;
    }
}
