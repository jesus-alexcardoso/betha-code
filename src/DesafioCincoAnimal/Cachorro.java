package DesafioCincoAnimal;

public class Cachorro extends Animal{
    public Cachorro(String nome, String raca, String som, Integer qtdPatas) {
        super(nome, raca, som, qtdPatas);
    }

    public Cachorro(String nome, String som) {
        super(nome, som);
    }

    @Override
    public String getSom() {
        return super.getSom() + " Au au";
    }
}
