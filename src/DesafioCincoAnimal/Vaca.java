package DesafioCincoAnimal;

public class Vaca extends Animal{
    public Vaca(String nome, String raca, String som, Integer qtdPatas) {
        super(nome, raca, som, qtdPatas);
    }

    public Vaca(String nome, String raca, Integer qtdPatas) {
        super(nome, raca, qtdPatas);
    }

    public Vaca(String nome, Integer qtdPatas) {
        super(nome, qtdPatas);
    }

    public Vaca(String nome, String som) {
        super(nome, som);
    }

    @Override
    public String getSom() {
        return super.getSom() + " MMMMmmuuuu";
    }
}
