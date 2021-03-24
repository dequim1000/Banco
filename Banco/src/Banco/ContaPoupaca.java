package Banco;

public class ContaPoupaca extends Conta{
    private String dataAniversario;
    private double saldoContaPoupanca;

    public ContaPoupaca(double saldo, int numero, Cliente cliente, String dataAniversario, double saldoContaPoupanca) {
        super(saldo, numero, cliente);
        this.dataAniversario = dataAniversario;
        this.saldoContaPoupanca = saldoContaPoupanca;
    }

    @Override
    public double sacar(double valor) {
        // TODO Auto-generated method stub
        return saldoContaPoupanca = saldoContaPoupanca - valor;
    }

    @Override
    public double depositar(double valor) {
        // TODO Auto-generated method stub
        return saldoContaPoupanca = saldoContaPoupanca + valor;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public double getSaldoContaPoupanca() {
        return saldoContaPoupanca;
    }

    public void setSaldoContaPoupanca(double saldoContaPoupanca) {
        this.saldoContaPoupanca = saldoContaPoupanca;
    }   
    
    

}
