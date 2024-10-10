package com.example.pesquisa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Estimulada extends AppCompatActivity {

    RadioGroup rgCandidatos;
    RadioButton rbZoro, rbSaitama, rbSnape, rbBojack, rbRick;
    Button btEnviar, btVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_estimulada);

        rgCandidatos = (RadioGroup)findViewById(R.id.rgCandidatos);
        rbZoro = (RadioButton)findViewById(R.id.rbZoro);
        rbSaitama = (RadioButton) findViewById(R.id.rbSaitama);
        rbSnape = (RadioButton)findViewById(R.id.rbSnape);
        rbBojack = (RadioButton) findViewById(R.id.rbBojack);
        rbRick = (RadioButton)findViewById(R.id.rbRick);
        btEnviar = (Button)findViewById(R.id.btEnviar);
        btVoltar = (Button)findViewById(R.id.btVoltar);


        btEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exibirPrincipalActivity();
            }
        });

        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exibirPrincipalActivity(1);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    private void exibirPrincipalActivity() {
        Intent telaPrincipal = new Intent(Estimulada.this, agradecimento.class);
        startActivity(telaPrincipal);
        finish();
    }
    private void exibirPrincipalActivity(int x) {
        Intent telaPrincipal = new Intent(Estimulada.this, Espontanea.class);
        startActivity(telaPrincipal);
        finish();
    }
}