package br.com.zup.Exercicio01;

public class Carro {
    String fabricante;
    String nome;
    String cor;
    int peso;
    double valor;

   public Carro(String fabricante, String nome, String cor, int peso, double valor){
        this.fabricante = fabricante;
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
        this.valor = valor;
   }
   public void darDesconto(double valorDesconto){
       valor = valor - valorDesconto;
   }
   public void pintar(String corNova){
       cor = corNova;
   }
}
