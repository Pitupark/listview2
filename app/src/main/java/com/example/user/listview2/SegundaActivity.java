package com.example.user.listview2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {
private ImageView imgcaja;
private TextView tv1,tv2,tv3,tv4,tv5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        imgcaja = (ImageView)findViewById(R.id.imgcaja);
        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        tv3 = (TextView)findViewById(R.id.tv3);
        tv4 = (TextView)findViewById(R.id.tv4);
        tv5 = (TextView)findViewById(R.id.tv5);
        Bundle bundle = getIntent().getExtras();
        String foto = getIntent().getStringExtra("Fotos");
        String nombress =getIntent().getStringExtra("nombres2");
        String annoss = getIntent().getStringExtra("annoss2");
        String editos = getIntent().getStringExtra("edito2");
        String guion1 = getIntent().getStringExtra("guion2");
        String dibujo1 = getIntent().getStringExtra("dibujo2");
        tv1.setText(nombress);
        tv2.setText(annoss);
        tv3.setText(editos);
        tv4.setText(guion1);
        tv5.setText(dibujo1);
        imgcaja.setImageResource(Integer.parseInt(foto));

        imgcaja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),TerceraActivity.class);
                i.putExtra("urll", "www.marvel.com");
                startActivity(i);

            }
        });
    }
}
