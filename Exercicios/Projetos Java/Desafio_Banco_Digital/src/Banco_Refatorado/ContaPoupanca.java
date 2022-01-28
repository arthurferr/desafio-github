package Banco_Refatorado;
public class ContaPoupanca extends Conta {

    protected int agencia;
    protected int numero;
    protected String tipoConta;

    public ContaPoupanca(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.tipoConta = Conta.TIPO_CP;
        this.numero = Conta.SEQUENCIAL++;
    }

}
