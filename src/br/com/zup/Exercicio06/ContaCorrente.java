package br.com.zup.Exercicio06;

public class ContaCorrente {
    private String nome;
    private String numeroDaConta;
    private double saldo = 0;

    public ContaCorrente(String nome, String numeroDaConta){
        this.nome = nome;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;

    }
    public String getNome(){
        return nome;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void saque(double saque){
        this.saldo = saldo - saque;
    }
    public void depositar(double deposito){
        this.saldo = saldo + deposito;
    }
    public void extrato (){
        System.out.println("Nome do correntista: "+nome+"\n" +
                "Numero da conta: "+numeroDaConta+"\n" +
                "Saldo da conta: R$"+saldo);
    }
}

