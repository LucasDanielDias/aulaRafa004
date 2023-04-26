package Atividade.Prova;

public class Pedido {
    Double Valorfinal = 0.0;
   public Double valorfruta = 0.0;
   public int quant =0;
    public Double fazerPedido(Double valortotal, int quantidade){
        valortotal =valorfruta * quantidade;
        Valorfinal += valortotal;
        return valortotal;
    }
}
