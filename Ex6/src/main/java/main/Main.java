package main;

import javax.swing.*;

//6. Uma loja de animais vende gatos e cachorros. Escreva um algoritmo que leia a quantidade
//de animais da loja e, para cada animal, leia a informação da espécie do animal (se é gato ou
//cachorro). Ao final, exiba a quantidade de animais que são gatos e a quantidade de animais
//que são cachorros existentes na loja.

public class Main {
    public static void main(String[] args) {
        int quantidadeAnimais = Integer.parseInt(JOptionPane.showInputDialog(
                null , "Digite a quantidade de animais na loja:"));

        int quantidadeGatos = 0;
        int quantidadeCachorros = 0;

        for (int i = 1; i <= quantidadeAnimais; i++) {
            String[] opcoes = {"Gato", "Cachorro"};
            int escolha = JOptionPane.showOptionDialog(
                    null, "Escolha a espécie do " + i + "° animal: ",
                    "Espécie",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]
            );

            if (escolha == 0) {
                quantidadeGatos++;
            } else if (escolha == 1) {
                quantidadeCachorros++;
            }
        }

        JOptionPane.showMessageDialog(
                null, "Quantidade de gatos: " + quantidadeGatos);

        JOptionPane.showMessageDialog(
                null, "Quantidade de cachorros: " + quantidadeCachorros);
    }
}