package Atividade;

import javax.swing.*;

public class Cantina {
    public static void main(String[] args) {
        Integer i = 1000;
        Pedido NumeroPdido = new Pedido();
        NumeroPdido.cliente.nome = JOptionPane.showInputDialog(null,"digite o seu nome\n");
        NumeroPdido.Massa.tipo = JOptionPane.showInputDialog(null,"Digite o tipo de massa");
        NumeroPdido.Massa.valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor"));
            if (i != 0) {
                 do {
                     Integer opcao = Integer.valueOf(JOptionPane.showInputDialog("fale qual são os ingredientes que você vai querer\n"
                          + "1-Peperone\n2-Bacon\n3-calabresa\n4-molho\n0-fechar"));
                      NumeroPdido.carrinho.add(opcao);
                      i=opcao;
                  }while (i!=0);
            }
            Double X = NumeroPdido.calcularPedido(NumeroPdido.Massa.valor,NumeroPdido.carrinho.size());
            JOptionPane.showMessageDialog(null,"O pedido da compra foi " + X);

    }
}

