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

public class Entrevistador extends AppCompatActivity {

    EditText edEntrevistador;
    Button btEntrevistar2, btSair;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_entrevistador);

        edEntrevistador = (EditText)findViewById(R.id.edEntrevistador);
        btEntrevistar2 = (Button)findViewById(R.id.btEntrevistar2) ;
        btSair = (Button)findViewById(R.id.btSair);

        btEntrevistar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exibirPrincipalActivity();

            }
        });
        btSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exibirPrincipalActivity(3);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    private void exibirPrincipalActivity() {
        Intent telaPrincipal = new Intent(Entrevistador.this, Identificacao.class);
        startActivity(telaPrincipal);
        finish();
    }

    private void exibirPrincipalActivity(int b) {
        Intent telaPrincipal = new Intent(Entrevistador.this, Tela_login.class);
        startActivity(telaPrincipal);
        finish();
    }
}