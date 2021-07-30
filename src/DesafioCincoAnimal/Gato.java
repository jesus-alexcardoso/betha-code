package DesafioCincoAnimal;

public class Gato extends Animal{

    public Gato(String nome, String raca, String som, Integer qtdPatas) {
        super(nome, raca, som, qtdPatas);
    }

    public Gato(String nome, String raca, Integer qtdPatas) {
        super(nome, raca, qtdPatas);
    }

    public Gato(String nome, Integer qtdPatas) {
        super(nome, qtdPatas);
    }

    @Override
    public String getSom() {
        return super.getSom() + " miau";
    }
}
