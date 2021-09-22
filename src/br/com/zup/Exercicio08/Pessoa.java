package br.com.zup.Exercicio08;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private double altura;
    private int idade;

    public Pessoa(String nome, String dataNascimento, double altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade(){
        return idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void calcularIdade(int anoNascimento){
        int ano = 2021;
        this.idade = ano - anoNascimento;
        System.out.println(getNome()+" Tem "+getIdade()+" anos.");

    }
    public void dados(){
        System.out.println("Dados pessoais:\n" +
                "Nome: "+getNome()+"\n" +
                "Data de Nascimento: "+getDataNascimento()+"\n" +
                "Altura: "+getAltura());
    }
}