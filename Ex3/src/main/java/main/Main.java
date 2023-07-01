package main;

//3. Em um restaurante Self-Service, o preço do quilo custa R$ 23,59. Crie um algoritmo
//que, para cada cliente, leia o peso do prato e valor gasto com bebida e calcule o valor total da
//conta que o cliente irá pagar [ valor da conta = bebida + (peso * 15) ]. Só encerre a execução
//quando o peso do prato digitado for igual a 0 e o valor da bebida for também igual a 0.


import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        double valorKilo = 23.59;

        while (true) {
            double pesoTotalPrato = Double.parseDouble(JOptionPane.showInputDialog(
                    null, "Informe o peso do prato: "));

            if (pesoTotalPrato == 0) {
                System.exit(0);
            }

            double valorBebida = Double.parseDouble(JOptionPane.showInputDialog(
                    null, "Digite o valor da bebida: "));

            double valorConta = valorBebida + (pesoTotalPrato * valorKilo);
            JOptionPane.showMessageDialog(
                    null, "Valor total da conta: R$" + valorConta);
        }
    }
}