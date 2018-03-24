package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {
    private Paint mPaintBar;
    private Paint mPaintLine;
    private Paint mPaintText;
    private Path mPath;

    public Practice11PieChartView(Context context) {
        super(context);
        initPaint();
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }

    private void initPaint(){
        mPaintBar = new Paint();
        mPaintBar.setAntiAlias(true);
        mPaintBar.setStyle(Paint.Style.FILL);
        mPaintBar.setColor(Color.RED);

        mPaintLine = new Paint();
        mPaintLine.setAntiAlias(true);
        mPaintLine.setStyle(Paint.Style.STROKE);
        mPaintLine.setColor(Color.WHITE);
        mPaintLine.setStrokeWidth(2);

        mPaintText = new Paint();
        mPaintText.setAntiAlias(true);
        mPaintText.setTextSize(24);
        mPaintText.setStyle(Paint.Style.STROKE);
        mPaintText.setColor(Color.WHITE);

        mPath = new Path();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        // 绘制折线
        mPath.moveTo(40, 40);
        mPath.lineTo(120, 40);
        mPath.lineTo(140, 60);
        canvas.drawPath(mPath, mPaintLine);

        mPath.reset();
        //mPath.moveTo();

        // 绘制饼图
        canvas.drawArc(80, 20, 380, 320, -180, 135, true, mPaintBar);
        mPaintBar.setColor(Color.YELLOW);
        canvas.drawArc(90, 30, 390, 330, -45, 45, true, mPaintBar);
        mPaintBar.setColor(Color.GRAY);
        canvas.drawArc(90, 30, 390, 330, 5, 10, true, mPaintBar);
        mPaintBar.setColor(Color.GREEN);
        canvas.drawArc(90, 30, 390, 330, 20, 30, true, mPaintBar);
        mPaintBar.setColor(Color.BLACK);
        canvas.drawArc(90, 30, 390, 330, 55, 40, true, mPaintBar);
        mPaintBar.setColor(Color.BLUE);
        canvas.drawArc(90, 30, 390, 330, 100, 80, true, mPaintBar);

        mPaintText.setTextSize(32);
        canvas.drawText("饼图", 300, 400, mPaintText);

    }

}
