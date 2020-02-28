package johnbryce.com.myapp.ui;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import johnbryce.com.myapp.R;
import johnbryce.com.myapp.utils.MySharedPreferences;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = null;

                if (MySharedPreferences.isLoggedIn(getApplicationContext())) {
                    intent = new Intent(SplashActivity.this, MainActivity.class);

                } else {
                    intent = new Intent(SplashActivity.this, LoginActivity.class);

                }
                startActivity(intent);
                finish();


            }
        }, 2000);
    }
}
