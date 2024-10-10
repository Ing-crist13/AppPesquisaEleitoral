package com.example.pesquisa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class agradecimento extends AppCompatActivity {

    Button btEntrevistar, btFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_agradecimento);

        btEntrevistar = (Button)findViewById(R.id.btEntrevistar2);
        btFinalizar = (Button)findViewById(R.id.btFinalizar);

        btEntrevistar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exibirPrincipalActivity();
            }
        });

        btFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exibirPrincipalActivity(2);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    private void exibirPrincipalActivity() {
        Intent telaPrincipal = new Intent(agradecimento.this, Identificacao.class);
        startActivity(telaPrincipal);
        finish();
    }
    private void exibirPrincipalActivity(int i) {
        Intent telaPrincipal = new Intent(agradecimento.this, Resultado.class);
        startActivity(telaPrincipal);
        finish();
    }
}