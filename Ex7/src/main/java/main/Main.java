package main;

//7. O restaurante da questão 17 realiza reservas de mesas através de ligações telefônicas e
//possui 50 mesas disponíveis para reserva. Dessas mesas, 25 são na área de fumantes e 25 na
//área de não fumantes. Para cada ligação recebida, o restaurante deve verificar se a reserva é
//para a mesa na área de fumantes ou de não fumantes e contabilizar a quantidade de mesas
//restantes disponíveis em cada área. Construa um algoritmo que realize a reserva das mesas e
//encerre a execução quando não houver mais mesas disponíveis (nem na área de fumantes,
//nem na área de não fumantes)

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int mesasFumantes = 25;
        int mesasNaoFumantes = 25;

        Fila filaFumantes = new Fila(mesasFumantes);
        Fila filaNaoFumantes = new Fila(mesasNaoFumantes);

        while (!filaFumantes.isFull() || !filaNaoFumantes.isFull()) {
            String[] options = {"Fumante", "Não Fumante"};
            int escolha = JOptionPane.showOptionDialog(
                    null, "Escolha a área desejada:", "Reserva de Mesas",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]
            );

            if (escolha == 0) {
                if (!filaFumantes.isFull()) {
                    filaFumantes.enqueue("Reserva na área de fumantes");
                    mesasFumantes--;

                    JOptionPane.showMessageDialog(
                            null, "Mesa reservada. Mesas disponíveis na área de fumantes: " + mesasFumantes);
                } else {
                    JOptionPane.showMessageDialog(
                            null, "Não há mais mesas disponíveis na área de fumantes.");
                }
            } else if (escolha == 1) {
                if (!filaNaoFumantes.isFull()) {
                    filaNaoFumantes.enqueue("Reserva na área de não fumantes");
                    mesasNaoFumantes--;
                    JOptionPane.showMessageDialog(
                            null, "Mesa reservada. Mesas disponíveis na área de não fumantes: " + mesasNaoFumantes);
                } else {
                    JOptionPane.showMessageDialog(
                            null, "Não há mais mesas disponíveis na área de não fumantes.");
                }
            }

            if (filaFumantes.isFull() && filaNaoFumantes.isFull()) {
                JOptionPane.showMessageDialog(
                        null, "Todas as mesas foram reservadas. Encerrando o programa.");
                break;
            }
        }
    }
}