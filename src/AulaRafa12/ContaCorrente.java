package AulaRafa12;

public class ContaCorrente {
    private Double saldo = 0.0;
    cliente clientes = new cliente();

    public cliente getClientes() {
        return clientes;
    }

    public void setClientes(cliente clientes) {
        this.clientes = clientes;
    }

    public void depositar(Double valor){
        saldo += valor;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
