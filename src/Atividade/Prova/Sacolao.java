package Atividade.Prova;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class Sacolao {

    public static void main(String[] args) {
       Double Finally = 0.0;
       Integer Frutas = 0;
        List carrinho = new ArrayList<Pedido>();
        Integer opcao ;
        Cliente cliente = new Cliente("");
        Pedido pedido = new Pedido();
        Fruta fruta = new Fruta();
        //Declaração das variaveis

        cliente.Nome = JOptionPane.showInputDialog("Olá qual é seu nome?");
        do {
            opcao = Integer.valueOf(JOptionPane.showInputDialog("Qual fruta você gostaria de comprar?\n" +
                    "1-Banana\n" +
                    "2-Laranja\n" +
                    "3-Goiaba\n" +
                    "4-Nada, gostaria de finalizar\n" +
                    "Por favor digite os numeros"));// Criei um modelo de "menu"
            if (1 == opcao){
                    carrinho.add(fruta.nome = "Banana");
                    pedido.valorfruta = Double.valueOf(JOptionPane.showInputDialog("Digite o valor da fruta"));
                    pedido.quant = Integer.valueOf(JOptionPane.showInputDialog("Quantas vai querer?"));
                    Finally += pedido.fazerPedido(pedido.valorfruta, pedido.quant);
                    Frutas++;
            } else if (2 == opcao) {
                    carrinho.add(fruta.nome = "Laranja");
                    pedido.valorfruta = Double.valueOf(JOptionPane.showInputDialog("Digite o valor da fruta"));
                    pedido.quant = Integer.valueOf(JOptionPane.showInputDialog("Quantas vai querer?"));
                    Finally += pedido.fazerPedido(pedido.valorfruta, pedido.quant);
                    Frutas++;
                }else if (3 == opcao) {
                    carrinho.add(fruta.nome = "Goiaba");
                    pedido.valorfruta = Double.valueOf(JOptionPane.showInputDialog("Digite o valor da fruta"));
                    pedido.quant = Integer.valueOf(JOptionPane.showInputDialog("Quantas vai querer?"));
                    Finally += pedido.fazerPedido(pedido.valorfruta, pedido.quant);
                    Frutas++;
                }//criei uma forma de validação para salvar os valores nos Arrays determinados usando recursos como valueof para converter os Strings
        }while (opcao != 4);
              JOptionPane.showMessageDialog(null,"O seu nome é " + cliente.Nome + "e você entro com um pedido de frutas "+
                      Frutas + " e o valor total foi " + pedido.Valorfinal);
    }
}
