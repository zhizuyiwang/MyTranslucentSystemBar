package mytranslucentsystembar.hsf.com.mytranslucentsystembar;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/**
 * 自己fitsSystemWindows，不用系统帮我
 */
public class Activity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_2);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
            ViewGroup firstChildAtDecorView = ((ViewGroup) ((ViewGroup)getWindow().getDecorView()).getChildAt(0));
            View statusView = new View(this);
            ViewGroup.LayoutParams statusViewLp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                    getStatusBarHeight());
            //颜色的设置可抽取出来让子类实现之
            statusView.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_light));
            firstChildAtDecorView.addView(statusView, 0, statusViewLp);
        }
    }
    private int getStatusBarHeight() {
        int resId = getResources().getIdentifier("status_bar_height","dimen","android");
        if(resId>0){
            Log.e("TAG","id不为0");
            return getResources().getDimensionPixelSize(resId);
        }
        Log.e("TAG","id为0");
        return 0;
    }
}
