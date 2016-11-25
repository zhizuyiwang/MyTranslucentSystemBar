package mytranslucentsystembar.hsf.com.mytranslucentsystembar;

import android.os.Bundle;

/**
 * 由系统给fitsSystemWindows
 */
public class Activity1 extends TranslucentBarBaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * 返回当前Activity布局文件的id
     *
     * @return
     */
    @Override
    protected int getLayoutResId() {
        return R.layout.activity_1;
    }
}
