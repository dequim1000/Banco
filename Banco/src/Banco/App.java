package Banco;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente c1 = new Cliente("Andre", "26/09/2001");
        Conta conta1 = new ContaCorrente(20000, 1, c1, 20000);
        System.out.println(conta1.getSaldo());
        conta1.depositar(50);
        System.out.println(conta1.getSaldo());
        System.out.println(conta1.getSaldo() + "  " +  conta1.getNumero() + "  " +  conta1.getCliente());
        conta1.sacar(100);
        System.out.println(conta1.getSaldo());
        System.out.println(conta1.getSaldo() + "  " +  conta1.getNumero() + "  " +  conta1.getCliente());
    }
}
