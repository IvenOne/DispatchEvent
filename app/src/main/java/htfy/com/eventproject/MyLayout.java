package htfy.com.eventproject;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class MyLayout extends LinearLayout {
    public String TAG = "MyLayout";
    public MyLayout(Context context) {
        super(context);
    }

    public MyLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MyLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
//        switch (event.getAction()){
//            case MotionEvent.ACTION_DOWN:
//                LUtil.D(TAG,TAG+" dispatchTouchEvent-------- "+"ActionDown");
//                break;
//            case MotionEvent.ACTION_MOVE:
//                LUtil.D(TAG,TAG+" dispatchTouchEvent-------- "+"ActionMove");
//                break;
//            case MotionEvent.ACTION_UP:
//                LUtil.D(TAG,TAG+" dispatchTouchEvent-------- "+"ActionUp");
//                break;
//            case MotionEvent.ACTION_CANCEL:
//                LUtil.D(TAG,TAG+" dispatchTouchEvent-------- "+"ActionCancel");
//                break;
//        }
//        boolean retBol = super.dispatchTouchEvent(event);
        LUtil.D(TAG,TAG+" dispatchTouchEvent-------- "+"super");
        return super.dispatchTouchEvent(event);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                LUtil.D(TAG,TAG+" onTouchEvent-------- "+"ActionDown");
                break;
            case MotionEvent.ACTION_MOVE:
                LUtil.D(TAG,TAG+" onTouchEvent-------- "+"ActionMove");
                break;
            case MotionEvent.ACTION_UP:
                LUtil.D(TAG,TAG+" onTouchEvent-------- "+"ActionUp");
                break;
            case MotionEvent.ACTION_CANCEL:
                LUtil.D(TAG,TAG+" onTouchEvent-------- "+"ActionCancel");
                break;
        }
//        boolean retBol = super.onTouchEvent(event);
        LUtil.D(TAG,TAG+" onTouchEvent-------- "+"super");
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                LUtil.D(TAG,TAG+" onInterceptTouchEvent-------- "+"ActionDown");
                break;
            case MotionEvent.ACTION_MOVE:
                LUtil.D(TAG,TAG+" onInterceptTouchEvent-------- "+"ActionMove");
                break;
            case MotionEvent.ACTION_UP:
                LUtil.D(TAG,TAG+" onInterceptTouchEvent-------- "+"ActionUp");
                break;
            case MotionEvent.ACTION_CANCEL:
                LUtil.D(TAG,TAG+" onInterceptTouchEvent-------- "+"ActionCancel");
                break;
        }
//        boolean retBol = super.onInterceptTouchEvent(event);
        LUtil.D(TAG,TAG+" onInterceptTouchEvent-------- "+"super");
        return super.onInterceptTouchEvent(event);
    }
}
