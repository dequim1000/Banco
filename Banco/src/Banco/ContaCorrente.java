package Banco;

public class ContaCorrente extends Conta{
    private double limite;


    public ContaCorrente(double saldo, int numero, Cliente cliente, double limite) {
        super(saldo, numero, cliente);
        this.saldo = saldo;
        saldo = this.saldo;
        this.limite = limite;
    }

    @Override
    public double sacar(double valor) {
        // TODO Auto-generated method stub
        return saldo = saldo - valor;
    }

    @Override
    public double depositar(double valor) {
        // TODO Auto-generated method stub
        return saldo = saldo + valor;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

        
       
}
