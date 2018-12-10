package com.example.user.listview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class TerceraActivity extends AppCompatActivity {
private WebView wbc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera);

        wbc = (WebView)findViewById(R.id.wbc);

        Bundle bundle = getIntent().getExtras();
        String urlenviada = bundle.getString("urll");
        wbc.loadUrl("https://www.marvel.com");
    }
}
