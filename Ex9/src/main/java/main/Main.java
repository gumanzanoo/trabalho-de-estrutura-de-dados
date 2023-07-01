package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int totalCasas = Integer.parseInt(JOptionPane.showInputDialog(
                null, "Informe a quantidade de casas participantes da pesquisa:"));

        int[] contagemCanais = new int[14];

        for (int i = 0; i < totalCasas; i++) {
            int canal;
            do {
                canal = Integer.parseInt(JOptionPane.showInputDialog(
                        null, "Informe o número do canal assistido na casa " + (i + 1) + ":"));
            } while (!(canal == 3 || canal == 5 || canal == 8 || canal == 11 || canal == 13));

            int pessoasAssistindo = Integer.parseInt(JOptionPane.showInputDialog(
                    null, "Informe a quantidade de pessoas assistindo o canal " + canal + " na casa " + (i + 1) + ":"));

            contagemCanais[canal] += pessoasAssistindo;
        }

        String resultado = "";

        for (int canal = 3; canal <= 13; canal += 2) {
            int totalPessoasAssistindo = contagemCanais[canal];
            if (totalPessoasAssistindo > 0) {
                double porcentagemAudiencia = (double) totalPessoasAssistindo / totalCasas * 100;
                resultado += "Canal " + canal + ": " + String.format("%.2f", porcentagemAudiencia) + "% de audiência\n";
            }
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}