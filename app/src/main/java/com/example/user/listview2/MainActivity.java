package com.example.user.listview2;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView;
import android.view.View;
import java.util.Arrays;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private ListView lv1;
    private int totalImagen;
    private int posicion;
    final Integer[]galeria={
            R.drawable.batman,
            R.drawable.amazing,
            R.drawable.civil,
            R.drawable.guante,
            R.drawable.fantasticos,
            R.drawable.logan,
            R.drawable.secret,
            R.drawable.watchmen,
            R.drawable.daredevil,
            R.drawable.xmen
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//variable del total de imagenes y la longitud del array
        totalImagen = galeria.length;

        lv1 = (ListView)findViewById(R.id.lv1);


        List<String> Lines = Arrays.asList(getResources().getStringArray(R.array.nombres));
        ArrayAdapter adaptador=new ArrayAdapter(this, android.R.layout.simple_list_item_1, Lines);
        lv1.setAdapter(adaptador);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                posicion = position;
                Resources res = getResources();

                String fotitos = galeria[posicion].toString();
                String[] nombres1 = res.getStringArray(R.array.nombres);
                String nombress = nombres1[posicion].toString();
                String[] annos1 = res.getStringArray(R.array.annos);
                String annoss = annos1[posicion].toString();
                String[] edito = res.getStringArray(R.array.editorial);
                String editos = edito[posicion].toString();
                String[] guions = res.getStringArray(R.array.guion);
                String guion1 = guions[posicion].toString();
                String[] dibujos = res.getStringArray(R.array.dibujo);
                String dibujo1 = dibujos[posicion].toString();
                Intent i= new Intent(getApplicationContext(),SegundaActivity.class);
                i.putExtra("nombres2",nombress);
                i.putExtra("annoss2",annoss);
                i.putExtra("edito2", editos);
                i.putExtra("guion2", guion1);
                i.putExtra("dibujo2",dibujo1);
                i.putExtra("Fotos",fotitos);
                if(posicion==0){


                    startActivityForResult(i,0);

                }
                if(posicion==1){

                    startActivityForResult(i,1);
                }
                if(posicion==2){

                    startActivityForResult(i,2);
                }
                if(posicion==3){

                    startActivityForResult(i,3);
                }
                if(posicion==4){

                    startActivityForResult(i,4);
                }
                if(posicion==5){

                    startActivityForResult(i,5);
                }
                if(posicion==6){

                    startActivityForResult(i,6);
                }
                if(posicion==7){

                    startActivityForResult(i,7);
                }
                if(posicion==8){

                    startActivityForResult(i,8);
                }

                if(posicion==9) {

                    startActivityForResult(i, 9);
                }
            }
        });
    }
}
