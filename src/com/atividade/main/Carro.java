package com.atividade.main;

public class Carro {

    private final String modelo;
    private final String classe;
    private final String cor;

    public Carro(String modelo, String classe, String cor) {
        this.modelo = modelo;
        this.classe = classe;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getClasse() {
        return classe;
    }

    public String getCor() {
        return cor;
    }
}
