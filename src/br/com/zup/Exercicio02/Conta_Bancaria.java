package br.com.zup.Exercicio02;

public class Conta_Bancaria {
    private int numero;
    private int saldo = 0;
    private String nome;

    public Conta_Bancaria(int numero, int saldo, String nome){
        this.numero = numero;
        this.saldo = saldo;
        this.nome = nome;
    }
    public void saque(int sacarQtd){
        if (sacarQtd > saldo){
            System.out.println("Você não possuí essa quantia de dinheiro em sua conta.");
        }else {
            System.out.println("Saque efetuado com sucesso.");
            saldo = saldo - sacarQtd;
        }
    }
    public void deposito(int depositarQtd){
        System.out.println("Depósito efetuado com sucesso.");
        saldo = saldo + depositarQtd;
    }
    public void extrato(){
        System.out.println("Dados de extrato bancário:\n" +
                "Nome do correntista: "+nome+"\n" +
                "Numero da conta: "+numero+"\n" +
                "Saldo da conta: "+saldo);

    }
}
