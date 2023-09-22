package com.example.mncariluaddankelilingsegitiga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button BtnKeliling, BtnLuas, BtnHitung;
TextView TVhasil;
EditText ETtinggi, ETalas, ETsisiA, ETsisiB, ETsisiC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ETtinggi = findViewById(R.id.tinggi);
        ETalas = findViewById(R.id.alas);
        ETsisiA = findViewById(R.id.sisiA);
        ETsisiB = findViewById(R.id.sisiB);
        ETsisiC = findViewById(R.id.sisiC);
        TVhasil = findViewById(R.id.hasil);
        BtnHitung=findViewById(R.id.Bhitung);
        BtnLuas=findViewById(R.id.Bluas);
        BtnKeliling=findViewById(R.id.Bkeliling);

        BtnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b,c,d,e;
                double hitung ;

                if (!ETtinggi.getText().toString().isEmpty()){
                    e=  Integer.parseInt(ETalas.getText().toString());
                    d=  Integer.parseInt(ETtinggi.getText().toString());
                    hitung=0.5 * e * d;
                    TVhasil.setText(hitung+"");
                }else {
                    a  =  Integer.parseInt(ETsisiA.getText().toString());
                    b  =  Integer.parseInt(ETsisiB.getText().toString());
                    c  =  Integer.parseInt(ETsisiC.getText().toString());
                    hitung= a + b + c;
                    TVhasil.setText(hitung+"");

                }

            }
        });
        BtnLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               ETalas.setText("");
                ETsisiA.setText("");
                ETsisiB.setText("");
                ETsisiC.setText("");
                TVhasil.setText("");
                ETtinggi.setVisibility(view.VISIBLE);
                ETalas.setVisibility(view.VISIBLE);
                ETsisiA.setVisibility(view.GONE);
                ETsisiB.setVisibility(view.GONE);
                ETsisiC.setVisibility(view.GONE);
            }
        });
        BtnKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ETsisiA.setText("");
                ETalas.setText("");
                ETtinggi.setText("");
                TVhasil.setText("");
                ETtinggi.setVisibility(view.GONE);
                ETalas.setVisibility(view.GONE);
                ETsisiA.setVisibility(view.VISIBLE);
                ETsisiB.setVisibility(view.VISIBLE);
                ETsisiC.setVisibility(view.VISIBLE);
            }
        });

    }
}