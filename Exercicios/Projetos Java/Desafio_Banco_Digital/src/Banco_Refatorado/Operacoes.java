package Banco_Refatorado;
public class Operacoes {

    double saldo = 0;

    public void sacar(double valor) {
        this.saldo -= valor;
        System.out.println("Saque: R$ " + valor);

    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Recebido: R$ " + valor);

    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        System.out.format("Valor Transferido: R$ %.2f%n", valor);
    }

    protected void impInfo(int agencia, int conta){
        System.out.format("Agencia: %d%n", agencia );
        if (conta == 1){
            System.out.print("C/C: Conta Corrente\n");
        }else{
            System.out.print("C/C: Conta Poupança\n");
        }

        System.out.format("Saldo: %.2f%n", this.saldo );
    }
}