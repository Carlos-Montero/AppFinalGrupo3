package com.example.carlos.appfinalgrupo3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.VolumeShaper;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityPassword extends AppCompatActivity {


    public String[] codigo =new String[10];
    int i=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        //Para controlar o escuchar los inputs, creamos los objetos View y los asociamos a los objetos del Layout
        Button b1 = (Button)findViewById(R.id.b1);
        Button b2 = (Button)findViewById(R.id.b2);
        Button b3 = (Button)findViewById(R.id.b3);
        Button b4 = (Button)findViewById(R.id.b4);
        Button b5 = (Button)findViewById(R.id.b5);
        Button b6 = (Button)findViewById(R.id.b6);
        Button b7 = (Button)findViewById(R.id.b7);
        Button b8 = (Button)findViewById(R.id.b8);
        Button b9 = (Button)findViewById(R.id.b9);
        Button b0 = (Button)findViewById(R.id.b0);
        Button bdelete = (Button)findViewById(R.id.bdelete);
        Button baccept = (Button)findViewById(R.id.baccept);
        TextView pin = (TextView)findViewById(R.id.pin);
    }


    //BOTONES 0-9
    public void zero(View v){
        Button b0 = (Button)findViewById(R.id.b0);
        TextView pin = (TextView)findViewById(R.id.pin);
        if(codigo[i] == null || codigo[i]== "")
        {
            codigo[i]="0";
        }
        else {
            String num = "0";
            codigo[i] = codigo[i].concat(num);
        }
        pin.setText(codigo[i]);
    }

    public void one(View v){
        Button b1 = (Button)findViewById(R.id.b1);
        TextView pin = (TextView)findViewById(R.id.pin);
        if(codigo[i] == null || codigo[i]== "")                     //Si es el primer valor que se añade al array
        {
            codigo[i]="1";
        }
        else {                                                      //Si no, hara la concatenacion
            String num = "1";
            codigo[i] = codigo[i].concat(num);
        }
        pin.setText(codigo[i]);
    }

    public void two(View v){
        Button b2 = (Button)findViewById(R.id.b2);
        TextView pin = (TextView)findViewById(R.id.pin);
        if(codigo[i] == null || codigo[i]== "")
        {
            codigo[i]="2";
        }
        else {
            String num = "2";
            codigo[i] = codigo[i].concat(num);
        }
        pin.setText(codigo[i]);
    }

    public void three(View v){
        Button b3 = (Button)findViewById(R.id.b3);
        TextView pin = (TextView)findViewById(R.id.pin);
        if(codigo[i] == null || codigo[i]== "")
        {
            codigo[i]="3";
        }
        else {
            String num = "3";
            codigo[i] = codigo[i].concat(num);
        }
        pin.setText(codigo[i]);
    }

    public void four(View v){
        Button b4 = (Button)findViewById(R.id.b4);
        TextView pin = (TextView)findViewById(R.id.pin);
        if(codigo[i] == null || codigo[i]== "")
        {
            codigo[i]="4";
        }
        else {
            String num = "4";
            codigo[i] = codigo[i].concat(num);
        }
        pin.setText(codigo[i]);
    }

    public void five(View v){
        Button b5 = (Button)findViewById(R.id.b5);
        TextView pin = (TextView)findViewById(R.id.pin);
        if(codigo[i] == null || codigo[i]== "")
        {
            codigo[i]="5";
        }
        else {
            String num = "5";
            codigo[i] = codigo[i].concat(num);
        }
        pin.setText(codigo[i]);
    }

    public void six(View v){
        Button b6 = (Button)findViewById(R.id.b6);
        TextView pin = (TextView)findViewById(R.id.pin);
        if(codigo[i] == null || codigo[i]== "")
        {
            codigo[i]="6";
        }
        else {
            String num = "6";
            codigo[i] = codigo[i].concat(num);
        }
        pin.setText(codigo[i]);
    }

    public void seven(View v){
        Button b7 = (Button)findViewById(R.id.b7);
        TextView pin = (TextView)findViewById(R.id.pin);
        if(codigo[i] == null || codigo[i]== "")
        {
            codigo[i]="7";
        }
        else {
            String num = "7";
            codigo[i] = codigo[i].concat(num);
        }
        pin.setText(codigo[i]);
    }

    public void eight(View v){
        Button b8 = (Button)findViewById(R.id.b8);
        TextView pin = (TextView)findViewById(R.id.pin);
        if(codigo[i] == null || codigo[i]== "")
        {
            codigo[i]="8";
        }
        else {
            String num = "8";
            codigo[i] = codigo[i].concat(num);
        }
        pin.setText(codigo[i]);
    }

    public void nine(View v){
        Button b9 = (Button)findViewById(R.id.b9);
        TextView pin = (TextView)findViewById(R.id.pin);
        if(codigo[i] == null || codigo[i]== "")
        {
            codigo[i]="9";
        }
        else {
            String num = "9";
            codigo[i] = codigo[i].concat(num);
        }
        pin.setText(codigo[i]);
    }

    //BOTON BARA BORRAR EL ÚLTIMO VALOR
    public void delete(View v){
        Button bdelete = (Button)findViewById(R.id.bdelete);
        TextView pin = (TextView)findViewById(R.id.pin);
        if(codigo[i] == null || codigo[i]== "")
        {
            codigo[i]=null;
        }
        else {
            codigo[i-1] = null;
        }
        pin.setText(codigo[i]);
    }


    //BOTON BARA ACCEPTAR
    public void baccept(View v){
        Button baccept = (Button)findViewById(R.id.bdelete);
        TextView pin = (TextView)findViewById(R.id.pin);
        //Si el valor es el correcto, hará el intent para la siguiente activity
        if(codigo.equals("1234"))
        {
            //Intent i = new Intent(this,SecondActivity.class);
            //startActivity(i);
        }
        //Si no, salta un error
        else {
                Toast error = Toast.makeText(getApplicationContext(),"PIN Error", Toast.LENGTH_SHORT);
                error.show();
                codigo=null;
        }
        pin.setText(codigo[i]);
    }


}
