package main;

//1. Desenvolva um algoritmo capaz de apresentar na tela
//o fatorial de um número inteiro informado pelo usuário.

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(
                null, "Digite um número para calcular o fatorial: "));

        double fatorial = fatorial(n);

        JOptionPane.showMessageDialog(
                null, fatorial);
    }

    private static double fatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
}