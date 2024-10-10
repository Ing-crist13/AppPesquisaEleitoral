package com.example.pesquisa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Espontanea extends AppCompatActivity {

    EditText edEspontanea;
    Button btProxima;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_espontanea);

        edEspontanea = (EditText)findViewById(R.id.edEspontanea);
        btProxima = (Button)findViewById(R.id.btProxima);


        btProxima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exibirPrincipalActivity();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    private void exibirPrincipalActivity() {
        Intent telaPrincipal = new Intent(Espontanea.this, Estimulada.class);
        startActivity(telaPrincipal);
        finish();
    }
}