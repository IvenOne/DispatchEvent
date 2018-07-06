package htfy.com.eventproject;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

public class SecondTextView extends TextView {

    public String TAG = "SecondTextView";
    public SecondTextView(Context context) {
        super(context);
    }

    public SecondTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SecondTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public SecondTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.d(TAG,TAG+" dispatchTouchEvent:event-"+event.getAction());
        return super.dispatchTouchEvent(event);
//        return false;
//        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG,TAG+" onTouchEvent:event-"+event.getAction());
//        return super.onTouchEvent(event);
//        return false;
        return true;
    }
}
