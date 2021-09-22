package br.com.zup.Exercicio03;

public class Main {

    public static void main(String[] args) {
	Elevador elevador = new Elevador(0, 20, 10,0);

    elevador.entra(5);
    elevador.subir(3);
    elevador.sai(2);
    elevador.subir(15);
    elevador.sai(3);
    elevador.descer(2);
    elevador.entra(10);
    elevador.pessoas();

    }
}
