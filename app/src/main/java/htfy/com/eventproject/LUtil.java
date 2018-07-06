package htfy.com.eventproject;

import android.util.Log;


public class LUtil {
     static boolean log = true;
    public static void D(String  tag,String msg){
        if(log) Log.d(tag,msg);
    }
}
