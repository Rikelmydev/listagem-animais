package com.example.aula06;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class segundaTela extends AppCompatActivity {

    private TextView tvNome, tvRaca, tvCor, tvIdade, tvAniversario;
    private ImageView ivPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        tvNome = findViewById(R.id.tv_nome);
        tvRaca = findViewById(R.id.tv_raca);
        tvCor = findViewById(R.id.tv_cor);
        tvIdade = findViewById(R.id.tv_idade);
        tvAniversario = findViewById(R.id.tv_aniversario);
        ivPet = findViewById(R.id.iv_pet);

        Bundle dados = getIntent().getExtras();
        if (dados != null) {
            tvNome.setText("Nome: " + dados.getString("nome"));
            tvRaca.setText("Raça: " + dados.getString("raca"));
            tvCor.setText("Cor: " + dados.getString("cor"));
            tvIdade.setText("Idade: " + dados.getInt("idade") + " anos");
            tvAniversario.setText("Aniversário: " + dados.getString("aniversario"));
            ivPet.setImageResource(dados.getInt("imagem"));
        }
    }
}