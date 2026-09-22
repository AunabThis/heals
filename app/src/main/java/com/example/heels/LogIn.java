package com.example.heels;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LogIn extends AppCompatActivity {

    Button btn2;
    TextView textView1, textView2;

    SharedPreferences preferences;

    String sharedPreferences = "My Prefes";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        btn2 = findViewById(R.id.login1);
        textView1 = findViewById(R.id.username);
        textView2 = findViewById(R.id.password);

        preferences = getSharedPreferences(sharedPreferences, MODE_PRIVATE);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String UserName = textView1.getText().toString().trim();
                String Password = textView2.getText().toString().trim();

                String savedUserName =
                        preferences.getString("Username", "");

                String savedPassword =
                        preferences.getString("Password", "");


                if (UserName.equals(savedUserName)
                        && Password.equals(savedPassword)) {

                    SharedPreferences.Editor editor = preferences.edit();

                    editor.putBoolean("isLoggedIn", true);

                    editor.apply();

                    Intent intent =
                            new Intent(LogIn.this, MainActivity.class);

                    startActivity(intent);

                    finish();

                } else {

                    Toast.makeText(
                            LogIn.this,
                            "Invalid Username or Password",
                            Toast.LENGTH_SHORT
                    ).show();
                }
            }
        });
    }
}
