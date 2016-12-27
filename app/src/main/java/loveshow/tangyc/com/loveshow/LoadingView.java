package loveshow.tangyc.com.loveshow;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import loveshow.tangyc.com.loveshow.utils.ScreenUtils;

/**
 * Created by tangyc on 2016/12/27.
 */

public class LoadingView extends View {
    /**
     * 左上圆画笔
     */
    private Paint ltPaint=new Paint();
    /**
     * 左下圆画笔
     */
    private Paint lbPaint=new Paint();
    /**
     * 右下圆画笔
     */
    private Paint rbPaint=new Paint();
    /**
     * 右上圆画笔
     */
    private Paint rtPaint=new Paint();
    private  int width;
    private int height;

    public LoadingView(Context context) {
        super(context);
        //init();
    }

    public LoadingView(Context context, AttributeSet attrs) {
        super(context, attrs);


        init(context,attrs);
    }

    public LoadingView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context,attrs);
    }

    private void init(Context context,AttributeSet attrs) {
        TypedArray typedArray=context.obtainStyledAttributes(attrs,R.styleable.LoadingView);
        ColorStateList ltColor=typedArray.getColorStateList(R.styleable.LoadingView_ltColor);
        ColorStateList lbColor=typedArray.getColorStateList(R.styleable.LoadingView_lbColor);
        ColorStateList rtColor=typedArray.getColorStateList(R.styleable.LoadingView_rtColor);
        ColorStateList rbColor=typedArray.getColorStateList(R.styleable.LoadingView_rbColor);
//        width= ScreenUtils.getScreenWidth(context);
//
//       height=ScreenUtils.getScreenHeight(context);
        //初始化画笔
        ltPaint.setColor(ltColor.getDefaultColor());
        lbPaint.setColor(lbColor.getDefaultColor());
        rtPaint.setColor(rtColor.getDefaultColor());
        rbPaint.setColor(rbColor.getDefaultColor());


        ltPaint.setAntiAlias(true);
        lbPaint.setAntiAlias(true);
        rtPaint.setAntiAlias(true);
        rbPaint.setAntiAlias(true);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        width=w;
        height=h;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(width/2-100,height/2-100,50,ltPaint);
        canvas.drawCircle(width/2-100,height/2+100,50,lbPaint);
        canvas.drawCircle(width/2+100,height/2-100,50,rtPaint);
        canvas.drawCircle(width/2+100,height/2+100,50,ltPaint);
        invalidate();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
