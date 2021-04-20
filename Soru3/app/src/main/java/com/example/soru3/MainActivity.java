package com.example.soru3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double sayigiris1;
    double sayigiris2;
    double sonucc;
    String islem="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //butonları tanımladık. id ile çektim...
        final Button esit=findViewById(R.id.button8);
        final Button topla=findViewById(R.id.button13);
        final Button cikar=findViewById(R.id.button14);
        final Button carpi=findViewById(R.id.button15);
        final Button bolu=findViewById(R.id.button16);
        final Button c=findViewById(R.id.button4);

        //text alıyoruz
        final EditText sayigir=(EditText)findViewById(R.id.editTextTextPersonName);

        //sonucu yazdırmak için kullanıyoruz...
        final TextView sonuc=(TextView)findViewById(R.id.textView);

        //başalngıc sıfır...
        sayigir.setText("0");

        //topla işlemi
        topla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayigiris1=Double.parseDouble(sayigir.getText().toString());
                islem="+";
                sayigir.setText("");
            }
        });

        //cıkar işlemi
        cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayigiris1=Double.parseDouble(sayigir.getText().toString());
                islem="-";
                sayigir.setText("");
            }
        });

        //carp işlemi
        carpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayigiris1=Double.parseDouble(sayigir.getText().toString());
                islem="*";
                sayigir.setText("");
            }
        });

        //bolu işlemi
        bolu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayigiris1=Double.parseDouble(sayigir.getText().toString());
                islem="/";
                sayigir.setText("");
            }
        });

        esit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayigiris2=Integer.parseInt(sayigir.getText().toString());
                //islem="="
                switch (islem){
                    case "+":
                        sonucc=sayigiris1+sayigiris2;
                        break;
                    case "-":
                        sonucc=sayigiris1-sayigiris2;
                        break;
                    case "*":
                        sonucc=sayigiris1*sayigiris2;
                        break;
                    case "/":
                        sonucc=sayigiris1/sayigiris2;
                }
                sonuc.setText(""+sonucc);
            }
        });

        //temizleme
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayigir.setText("");
            }
        });

        //sayiları buradan al
        final Button sayi1=findViewById(R.id.button);
        final Button sayi2=findViewById(R.id.button2);
        final Button sayi3=findViewById(R.id.button3);
        final Button sayi4=findViewById(R.id.button5);
        final Button sayi5=findViewById(R.id.button6);
        final Button sayi6=findViewById(R.id.button7);
        final Button sayi7=findViewById(R.id.button9);
        final Button sayi8=findViewById(R.id.button10);
        final Button sayi9=findViewById(R.id.button11);
        //SAYI GİRİŞLERİ İÇİN BUTONLARI AKTİF EDİYORUZ
        sayi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayigir.setText("1");
            }
        });
        sayi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayigir.setText("2");
            }
        });
        sayi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayigir.setText("3");
            }
        });
        sayi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayigir.setText("4");
            }
        });
        sayi5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayigir.setText("5");
            }
        });
        sayi6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayigir.setText("6");
            }
        });
        sayi7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayigir.setText("7");
            }
        });
        sayi8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayigir.setText("8");
            }
        });
        sayi9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayigir.setText("9");
            }
        });
    }
}