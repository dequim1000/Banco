package Banco;

public abstract class Conta {
    protected double saldo;
    private int numero;
    private Cliente cliente;

    public abstract double sacar(double valor);

    public abstract double depositar(double valor);

    public Conta(double saldo, int numero, Cliente cliente) {
        this.saldo = saldo;
        this.numero = numero;
        this.cliente = cliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    
}
