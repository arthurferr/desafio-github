package Banco_Refatorado;
public class Main {
    public static void main(String[] args) {

        Conta conta1 = new ContaCorrente();
        Conta conta2 = new ContaPoupanca();

        // Operações com a Conta Corrente
        conta1.impInfo(1,1);
        System.out.println(" ************ ");
        conta1.depositar(500);
        System.out.println(" ************ ");
        conta1.impInfo(1,1);
        System.out.println(" ************ ");
        conta1.sacar(50);
        System.out.println(" ************ ");
        conta1.impInfo(1,1);
        System.out.println(" ************ ");

        // Transferencia entre Contas
        conta1.transferir(100,conta2);
        System.out.println(" ************ ");
        System.out.println("\n");

        // Operações com Conta Poupança
        conta2.impInfo(1,2);
        System.out.println(" ************ ");
        conta2.impInfo(1,2);
        System.out.println(" ************ ");
        conta2.sacar(50);
        System.out.println(" ************ ");
        conta2.impInfo(1,2);
        System.out.println(" ************ ");
    }
}
