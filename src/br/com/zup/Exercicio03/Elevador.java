package br.com.zup.Exercicio03;

public class Elevador {
    private int andarAtual = 0;
    private int totalAndares;
    private int capacidade;
    private int qtdPessoas;

    public Elevador (int andarAtual, int totalAndares, int capacidade, int qtdPessoas){
        this.andarAtual = andarAtual;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.qtdPessoas = qtdPessoas;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void entra(int qtdPessoasEntra){
        int totalPessoas = qtdPessoas + qtdPessoasEntra;

        if (totalPessoas > capacidade){
            System.out.println("Elevador não comporta tal quantidade.\n" +
                    "Quantidade de pessoas que excedeu: "+(totalPessoas-capacidade));
        }else {
            qtdPessoas = totalPessoas;
            System.out.println(totalPessoas+ " Pessoas embarcaram no elevador.");
        }
    }
    public void sai(int qtdPessoasSai){
        int totalPessoas = qtdPessoas - qtdPessoasSai;

        if(totalPessoas < 0){
            System.out.println("Você não pode tirar uma quantidade de pessoas maior do que a quantidade de pessoas presente.");
        }else {
            qtdPessoas = totalPessoas;
            System.out.println(totalPessoas+" Pessoas desembarcaram do elevador.");
        }
    }
    public void subir(int qtdAndaresSubir){
        int subirAndar = andarAtual + qtdAndaresSubir;
        if (subirAndar > totalAndares){
            System.out.println("Você não pode subir uma quantidade maior de andares do que existem no edifício.");
        }else{
            andarAtual = subirAndar;
            System.out.println("Elevador subiu "+qtdAndaresSubir+" andares e está no andar "+andarAtual);
        }
    }
    public void descer(int qtdAndaresDescer){
        int descerAndar = andarAtual - qtdAndaresDescer;
        if (descerAndar > totalAndares){
            System.out.println("Você não pode descer uma quantidade maior de andares do que existem no edifício.");
        }else{
            andarAtual = descerAndar;
            System.out.println("Elevador desceu "+qtdAndaresDescer+" andares e está no andar "+andarAtual);
        }
    }
    public void pessoas (){
        System.out.println(qtdPessoas + " Pessoas estão atualmente no elevador.");
    }
}
