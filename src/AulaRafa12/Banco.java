package AulaRafa12;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();
        c1.depositar(200.0);
        ContaCorrente c2 = new ContaCorrente();
        c2.depositar(100.0);

        c1.clientes.nomeC = "João";
        c2.clientes.nomeC = "Pedro";

        List Contas = new ArrayList();
        Contas.add(c1);
        Contas.add(c2);
        for(int i=0; i<Contas.size();i++){
            ContaCorrente cc = (ContaCorrente) Contas.get(i);
            System.out.println("A conta do cliente "+ cc.getClientes().nomeC+" possui " +cc.getSaldo());
        }
    }
}
