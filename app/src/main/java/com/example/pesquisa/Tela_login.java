package com.example.pesquisa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Tela_login extends AppCompatActivity {

    Button btLogin;
    EditText edUsuario, edSenha;
    TextView tvSenha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela_login);

        btLogin = (Button)findViewById(R.id.btLogin);
        edUsuario = (EditText)findViewById(R.id.edUsuario);
        edSenha = (EditText)findViewById(R.id.edSenha);
        tvSenha = (TextView)findViewById(R.id.tvSenha);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario, senha;

                usuario = edUsuario.getText().toString();
                senha = edSenha.getText().toString();


                if(usuario.equals("entrevistador") && senha.equals("entrevistador")) {
                    exibirPrincipalActivity();
                } else if (usuario.equals("adm") && senha.equals("adm")) {
                    exibirPrincipalActivity(4);
                }else
                    tvSenha.setText("Senha e/ou usuario incorretos");
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    private void exibirPrincipalActivity() {
        Intent telaPrincipal = new Intent(Tela_login.this, Entrevistador.class);
        startActivity(telaPrincipal);
        finish();
    }
        private void exibirPrincipalActivity(int a) {
            Intent telaPrincipal = new Intent(Tela_login.this, Adm.class);
            startActivity(telaPrincipal);
            finish();
        }

}