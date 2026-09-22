package com.example.heels;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {

    TextView textView1, textView2, textView3, textView4;
    Button signup;

    SharedPreferences preferences;

    String sharedPreference = "My Prefes";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        textView1 = findViewById(R.id.etusername);
        textView2 = findViewById(R.id.etemail);
        textView3 = findViewById(R.id.etpassword);
        textView4 = findViewById(R.id.etconfirmpassword);

        signup = findViewById(R.id.signup);

        preferences = getSharedPreferences(sharedPreference, MODE_PRIVATE);


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = textView1.getText().toString().trim();
                String email = textView2.getText().toString().trim();
                String password = textView3.getText().toString().trim();
                String confirmPassword = textView4.getText().toString().trim();


                // Empty fields check
                if (username.isEmpty() || email.isEmpty()
                        || password.isEmpty() || confirmPassword.isEmpty()) {

                    Toast.makeText(SignUp.this,
                            "Please fill all fields",
                            Toast.LENGTH_SHORT).show();

                }

                // Password check
                else if (!password.equals(confirmPassword)) {

                    Toast.makeText(SignUp.this,
                            "Passwords do not match",
                            Toast.LENGTH_SHORT).show();

                }

                // Account create
                else {

                    SharedPreferences.Editor editor = preferences.edit();

                    editor.putString("Username", username);
                    editor.putString("Email", email);
                    editor.putString("Password", password);

                    editor.putBoolean("isLoggedIn", false);

                    editor.apply();

                    Toast.makeText(SignUp.this,
                            "Account Created Successfully",
                            Toast.LENGTH_SHORT).show();

                    startActivity(new Intent(SignUp.this, LogIn.class));

                    finish();
                }

            }
        });

    }
}