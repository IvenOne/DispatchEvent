package htfy.com.eventproject;


import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;

public class MyButton extends Button {

    String TAG = "MyButton";
    public MyButton(Context context) {
        super(context);
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MyButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
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
        LUtil.D(TAG,TAG+" dispatchTouchEvent-------- "+false);
        return false;
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


}
