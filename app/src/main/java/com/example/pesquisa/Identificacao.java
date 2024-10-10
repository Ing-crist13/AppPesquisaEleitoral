package com.example.pesquisa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Identificacao extends AppCompatActivity {
    EditText edNome, edIdade, edTelefone, edData, edHora;
    RadioGroup rgEstadoCivil;
    RadioButton rbSolteiro, rbCasado, rbDivorciado;
    Button btIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_identificacao);

        edNome = (EditText)findViewById(R.id.edEntrevistador);
        edIdade = (EditText)findViewById(R.id.edIdade);
        edTelefone = (EditText)findViewById(R.id.edTelefone);
        edData = (EditText)findViewById(R.id.edData);
        edHora = (EditText)findViewById(R.id.edHora);
        rgEstadoCivil = (RadioGroup)findViewById(R.id.rgEstadoCivil);
        rbSolteiro = (RadioButton)findViewById(R.id.rbSolteiro);
        rbCasado = (RadioButton)findViewById(R.id.rbCasado);
        rbDivorciado = (RadioButton)findViewById(R.id.rbDivorciado);
        btIniciar = (Button)findViewById(R.id.btInciar);


        btIniciar.setOnClickListener(new View.OnClickListener() {
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
        Intent telaPrincipal = new Intent(Identificacao.this, Espontanea.class);
        startActivity(telaPrincipal);
        finish();
    }
}