package Banco_Refatorado;
public class ContaCorrente extends Conta {

    protected int agencia;
    protected int numero;
    protected String tipoConta;

    public ContaCorrente() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Conta.SEQUENCIAL;
        this.tipoConta = Conta.TIPO_CC;
    }
}
