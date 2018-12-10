package com.example.user.listview2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class splashScreen extends AppCompatActivity {
private ImageView img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        img2 = (ImageView)findViewById(R.id.img2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(splashScreen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        },2000);

    }
}
