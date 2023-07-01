package main;

import javax.swing.*;

//2. Escreva um algoritmo que simule o funcionamento de um caixa de supermercado.
//O a. seu algoritmo deve receber do a informação de quantos produtos o cliente comprou e, para
//cada produto, deveráler o seu preço. Ao final, deverá informar quanto o cliente deve pagar
//pelas compras.

public class Main {
    public static void main(String[] args) {
        int quantidadeProdutos = Integer.parseInt(JOptionPane.showInputDialog(
                null, "Digite a quantidade de produtos comprados:"));
        
        double totalCompra = 0;
        for (int i = 1; i <= quantidadeProdutos; i++) {
            double precoProduto = Double.parseDouble(JOptionPane.showInputDialog(
                    null, "Digite o preço do " + i + "° produto: "));

            totalCompra += precoProduto;
        }

        JOptionPane.showMessageDialog(
                null, "Total da compra: R$" + totalCompra);
    }
}