package Atividade;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    massa Massa = new massa();
    Cliente cliente = new Cliente();
    List carrinho = new ArrayList();

    public Double calcularPedido(Double valor, Integer Ac){
        Ac = carrinho.size();
        valor = Massa.valor;
        Double Valortotal = valor + ((Ac-1) * 2);
        return Valortotal;
    }
}
