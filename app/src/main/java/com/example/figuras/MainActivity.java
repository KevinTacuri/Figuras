package com.example.figuras;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int lados = 2;
    private Figura figura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button reiniciarBtn = findViewById(R.id.reiniciar);
        Button generarBtn = findViewById(R.id.generar);
        figura = findViewById(R.id.figura);

        reiniciarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lados = 2;
                figura.setSides(0);
            }
        });
        generarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lados++;
                figura.setSides(lados);
            }
        });


    }
}
