package mytranslucentsystembar.hsf.com.mytranslucentsystembar;

import android.os.Build;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

public abstract class TranslucentBarBaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(getLayoutResId());//把设置布局文件的操作交给继承的子类

        ViewGroup contentView = (ViewGroup) findViewById(Window.ID_ANDROID_CONTENT);

        View parentView = contentView.getChildAt(0);
        if(parentView!=null && Build.VERSION.SDK_INT >= 14){
            parentView.setFitsSystemWindows(true);

        }
    }

    /**
     * 返回当前Activity布局文件的id
     *
     * @return
     */
    abstract protected int getLayoutResId();
}
