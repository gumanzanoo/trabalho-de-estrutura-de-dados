package main;

//5. Desenvolver um algoritmo que leia a altura de 15 pessoas. Este programa deverácalcular e
//mostrar a: . A menor altura do grupo; b. A maior altura do grupo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        double menorAltura = 999999999;
        double maiorAltura = -999999999;

        for (int i = 1; i <= 15; i++) {
            double altura = Double.parseDouble(JOptionPane.showInputDialog(
                    null, "Digite a altura da " + i + "° pessoa: "));

            if (altura < menorAltura) {
                menorAltura = altura;
            }

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
        }

        JOptionPane.showMessageDialog(
                null, "Menor altura do grupo: " + menorAltura);

        JOptionPane.showMessageDialog(
                null, "Maior altura do grupo: " + maiorAltura);
    }
}