public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.imprimirExtrato();
        cc.depositar(200);
        cc.imprimirExtrato();
        cc.sacar(34);
        cc.imprimirExtrato();

        cp.imprimirExtrato();
        cc.transferir(47.63, cp);
        cp.imprimirExtrato();
        cc.imprimirExtrato();
    }


}
