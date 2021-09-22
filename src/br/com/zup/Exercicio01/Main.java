package br.com.zup.Exercicio01;

public class Main {
    public static void main(String[] args) {
    Carro carro = new Carro("Chevrolet", "Gol", "Rosa", 200, 3000.00);

        System.out.println(carro.cor);
        carro.pintar("Verde");
        System.out.println(carro.cor);
        System.out.println(carro.valor);
        carro.darDesconto(200);
        System.out.println(carro.valor);

    }
}
