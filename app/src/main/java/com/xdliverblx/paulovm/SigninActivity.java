package com.xdliverblx.paulovm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SigninActivity extends AppCompatActivity {


    private EditText editTextEmail, editTextPassword;
    private Button buttonLogin;
    private TextView textViewForgotPassword, textViewSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        // Initialize UI elements
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLoginGuest);
        textViewForgotPassword = findViewById(R.id.textViewForgotPassword);
        textViewSignUp = findViewById(R.id.textViewSignUp);
        Button GuestLogin = findViewById(R.id.buttonLoginGuest);
        // Set a click listener for the login button
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Retrieve entered email and password
                String email = editTextEmail.getText().toString();
                String password = editTextPassword.getText().toString();
                // Implement authentication logic here
                if (email.equals("test@example.com") && password.equals("123456")) {
                    // Successful login
                    Toast.makeText(SigninActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.activity_my);


                } else {
                    // Failed login
                    Toast.makeText(SigninActivity.this, "Invalid email or password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Set a click listener for the forgot password TextView
        textViewForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Implement forgot password logic here
                Toast.makeText(SigninActivity.this, "Forgot password feature not implemented", Toast.LENGTH_SHORT).show();
            }
        });
        // Set a click listener for the sign up TextView
        textViewSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Implement sign up logic here
                Toast.makeText(SigninActivity.this, "Sign up feature not implemented", Toast.LENGTH_SHORT).show();
            }
        });

        GuestLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_my);
                Intent intent = new Intent(SigninActivity.this, MyActivity.class);
                startActivity(intent);
                finish();
            }});
    }
}