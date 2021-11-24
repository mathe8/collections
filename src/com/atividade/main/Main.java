package com.atividade.main;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Carro> carros = new ArrayList<Carro>();

        Carro c1 = new Carro("NissanSilvia", "Coupé esportivo", "Prateado");
        Carro c2 = new Carro("Mazda Rx7", "Coupé de duas portas", "Vermelho");
        Carro c3 = new Carro("Honda Acura NSX", "Sport", "Laranja Escuro");
        Carro c4 = new Carro("Porsche 918", "Esportivo Supercarro", "Prateado");

        carros.add(c1);
        carros.add(c2);
        carros.add(c3);
        carros.add(c4);

        for (int i = 0; i < carros.size(); i++) {
            System.out.println("Modelo:.."+carros.get(i).getModelo());
            System.out.println("Classe:.."+carros.get(i).getClasse());
            System.out.println("Cor:....."+carros.get(i).getCor());
            System.out.print("\n");
        }

    }
}
