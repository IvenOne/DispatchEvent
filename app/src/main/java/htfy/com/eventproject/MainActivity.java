package htfy.com.eventproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,View.OnTouchListener{

    public String TAG = "MainActivity";
    TextView myButton ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton = findViewById(R.id.mybutton);
        myButton.setOnTouchListener(this);
        myButton.setOnClickListener(this);

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
    public void onClick(View view) {
        Toast.makeText(getBaseContext(),TAG+" I am Clicked",Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onTouch(View view, MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                LUtil.D(TAG,TAG+" onTouch-------- "+"ActionDown");
                Toast.makeText(getBaseContext(),TAG+" I am TouchedDown",Toast.LENGTH_LONG).show();
                break;
            case MotionEvent.ACTION_MOVE:
                LUtil.D(TAG,TAG+" onTouch-------- "+"ActionMove");
                break;
            case MotionEvent.ACTION_UP:
                LUtil.D(TAG,TAG+" onTouch-------- "+"ActionUp");
                break;
            case MotionEvent.ACTION_CANCEL:
                LUtil.D(TAG,TAG+" onTouch-------- "+"ActionCancel");
                break;
        }
        return false;
    }
}
