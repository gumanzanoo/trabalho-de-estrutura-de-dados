package main;

//4. Escreva um algoritmo que leia a quantidade de alunos em uma turma. Em seguida,
//a. para cada aluno, leia a informação de suas 2 notas, calcule a média e informe se o
//b. aluno estáaprovado ou reprovado. O aluno estáaprovado apenas se a sua média for maior
//ou igual a 6.

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int quantidadeAlunos = Integer.parseInt(JOptionPane.showInputDialog(
                null, "Digite o total de alunos na turma: "));

        for (int i = 1; i <= quantidadeAlunos; i++) {
            double nota1 = Double.parseDouble(JOptionPane.showInputDialog(
                    null, "Digite a nota do 1° Bim do aluno N° " + i + ": "));

            double nota2 = Double.parseDouble(JOptionPane.showInputDialog(
                    null, "Digite a nota do 2° Bim do aluno  N° " + i + ": "));

            double media = (nota1 + nota2) / 2;

            if (media >= 60) {
                JOptionPane.showMessageDialog(
                        null, "Aluno N° " + i + " aprovado!");
            } else {
                JOptionPane.showMessageDialog(
                        null, "Aluno N° " + i + " reprovado!");
            }
        }
    }
}