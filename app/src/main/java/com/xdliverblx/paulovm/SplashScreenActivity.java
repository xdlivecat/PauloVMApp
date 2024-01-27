package com.xdliverblx.paulovm;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private TextView textViewLoading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // Initialize UI elements
        progressBar = findViewById(R.id.progressBar);
        textViewLoading = findViewById(R.id.textViewLoading);

        // Start the loading animation
        startLoadingAnimation();

        // Perform your initial tasks here, such as data initialization or network calls
        // After completing the tasks, call the 'goToMainActivity()' method
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                goToMainActivity();
            }
        }, 3000); // 3000ms = 3 seconds
    }

    private void startLoadingAnimation() {
        progressBar.setVisibility(View.VISIBLE);
        textViewLoading.setVisibility(View.VISIBLE);
    }

    private void stopLoadingAnimation() {
        progressBar.setVisibility(View.GONE);
        textViewLoading.setVisibility(View.GONE);
    }

    private void goToMainActivity() {
        stopLoadingAnimation();
        Intent intent = new Intent(this, MyActivity.class);
        startActivity(intent);
        finish();
    }
}