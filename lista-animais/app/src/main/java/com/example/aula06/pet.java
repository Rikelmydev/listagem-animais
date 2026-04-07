package com.example.aula06;

public class pet {
    public String nome;
    public String cor;
    public String raca;
    public int idade;
    public String aniversario;
    public int imagemResourceId;

    public pet(String nome, String cor, String raca, int idade, String aniversario, int imagemResourceId) {
        this.nome = nome;
        this.cor = cor;
        this.raca = raca;
        this.idade = idade;
        this.aniversario = aniversario;
        this.imagemResourceId = imagemResourceId;
    }

    public String info() {
        return "Nome: " + nome + "\nCor: " + cor + "\nRaça: " + raca + "\nIdade: " + idade;
    }
}