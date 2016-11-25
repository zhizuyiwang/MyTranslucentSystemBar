package mytranslucentsystembar.hsf.com.mytranslucentsystembar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void btn1(View v){
        startActivity(new Intent(this,Activity1.class));
    }
    public void btn2(View v){
        startActivity(new Intent(this,Activity2.class));

    }
}
