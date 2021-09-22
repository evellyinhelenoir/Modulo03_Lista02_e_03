package br.com.zup.Exercicio04;

public class Cartao_Credito {
    int limite;
    int saldoFatura;
    String nome;

    public Cartao_Credito(int limite, String nome){
        this.limite = limite;
        this.nome = nome;
    }
    public void aumentarLimite(int qtdAumentarLimite){
        limite = limite + qtdAumentarLimite;
    }
    public void diminuirLimite(int qtdDiminuirLimite){
        limite = limite - qtdDiminuirLimite;
    }
    public void realizarCompra(int valorCompra){
        if(valorCompra > limite){
            System.out.println("O valor da compra ultrapassa o seu limite de crédito.");
        }else {
            System.out.println("Compra realizada com sucesso.");
            saldoFatura = saldoFatura + valorCompra;
        }
    }
    public void imprimirFatura(){
        System.out.println("Valor a ser pago da fatura esse mês: "+saldoFatura);
    }
}
