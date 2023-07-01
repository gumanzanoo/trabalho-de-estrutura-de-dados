package main;

//8. Um viajante decidiu se aventurar e percorrer toda a BR 101 de carro a partir do quilômetro 0
//atéultrapassar o quilômetro 4000, parando em várias cidades durante o
//a. percurso. Crie um algoritmo que, em cada cidade que o viajante parar, leia a
//b. informação da quilometragem percorrida e adicione ao valor da quilometragem
//total.
//c. Encerre o algoritmo quando o valor da quilometragem total percorrida for igual ou
//ultrapassar os 4000 km.

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        double quilometragemTotal = 0;

        while (quilometragemTotal < 4000) {
            String input = JOptionPane.showInputDialog(
                    null, "Informe a quilometragem percorrida: ");

            double quilometragemCidade = Double.parseDouble(input);

            quilometragemTotal += quilometragemCidade;

            JOptionPane.showMessageDialog(
                    null, "Quilometragem total percorrida: " + quilometragemTotal + " km");

            if (quilometragemTotal >= 4000) {
                JOptionPane.showMessageDialog(
                        null, "Você atingiu ou ultrapassou 4000 km.");
                break;
            }
        }
    }
}