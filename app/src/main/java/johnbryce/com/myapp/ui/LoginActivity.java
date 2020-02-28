package johnbryce.com.myapp.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import johnbryce.com.myapp.R;
import johnbryce.com.myapp.utils.MySharedPreferences;
import johnbryce.com.myapp.utils.MyTextUtils;

public class LoginActivity extends AppCompatActivity {

    private EditText editTextUser;
    private EditText editTextPass;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setViews();
        setClickLinstener();



    }

    private void setClickLinstener() {
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (MyTextUtils.isValidEmail(editTextUser.getText().toString()) && editTextPass.getText().toString().equals("1234")) {
                    openMainScreen();
                    writeToPrefs();
                } else {
                    showErrorMessage();
                }
            }
        });
    }

    private void writeToPrefs() {
        MySharedPreferences.updateLoggedIn(getApplicationContext(),true);
    }

    private void showErrorMessage() {
        Toast.makeText(LoginActivity.this, getString(R.string.invlid_user_or_pass), Toast.LENGTH_SHORT).show();
    }

    private void openMainScreen() {
        Intent intent = new Intent(LoginActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    private void setViews() {
        editTextUser = (EditText) findViewById(R.id.edit_text_user);
        editTextPass = (EditText) findViewById(R.id.edit_text_pass);
        buttonLogin = (Button) findViewById(R.id.button_login);
    }
}
