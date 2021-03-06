package archfx.com.epidermicare;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //setTitle("MainMenu");

    }

    public  void onClickProfile(View view)
    {
        if(view.getId()==R.id.ProfileButton) {
            Intent b = new Intent(this, ProfileActivity.class);
            startActivity(b);
        }

    }
    public void onClickReport(View view)
    {
        if(view.getId()==R.id.ReportButton) {
            Intent a = new Intent(this, ProfileActivity.class);
            startActivity(a);
        }

    }
    public void onClickStatus(View view)
    {
        if(view.getId()==R.id.StatusButton) {
            Intent c = new Intent(this, StatusActivity.class);
            startActivity(c);
        }

    }
}
