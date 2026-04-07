package com.example.aula06;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    pet pet1, pet2, pet3, pet4, pet5, pet6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pet1 = new pet("Slinky", "Caramelo", "Golden", 3, "15/03/2021", R.drawable.golden);
        pet2 = new pet("Théo", "Preto", "Pug", 2, "22/07/2022", R.drawable.pug);
        pet3 = new pet("Tusk", "Branco e Cixnza", "Husky Siberiaano", 4, "10/01/2020", R.drawable.husky);
        pet6 = new pet("Robinho", "Cinza e Preto", "Siamês", 5, "05/05/2019", R.drawable.robinho);
        pet4 = new pet("Fred", "Cinza", "Persian", 1, "30/11/2023", R.drawable.persia);
        pet5 = new pet("Romeu", "Salmão", "Gato Pelado", 3, "18/09/2021", R.drawable.unnamed);

        findViewById(R.id.button1).setOnClickListener(v -> abrirDetalhes(pet1));
        findViewById(R.id.button2).setOnClickListener(v -> abrirDetalhes(pet2));
        findViewById(R.id.button3).setOnClickListener(v -> abrirDetalhes(pet3));
        findViewById(R.id.button4).setOnClickListener(v -> abrirDetalhes(pet4));
        findViewById(R.id.button5).setOnClickListener(v -> abrirDetalhes(pet5));
        findViewById(R.id.button).setOnClickListener(v -> abrirDetalhes(pet6));
    }

    private void abrirDetalhes(pet petSelecionado) {
        Intent intent = new Intent(this, segundaTela.class);
        intent.putExtra("nome", petSelecionado.nome);
        intent.putExtra("cor", petSelecionado.cor);
        intent.putExtra("raca", petSelecionado.raca);
        intent.putExtra("idade", petSelecionado.idade);
        intent.putExtra("aniversario", petSelecionado.aniversario);
        intent.putExtra("imagem", petSelecionado.imagemResourceId);
        startActivity(intent);
    }
}