package DesafioCincoAnimal;

public class AnimalBuilder {
    public static Animal criarAnimal(String especie, String nome, String raca, String som, Integer qtdPatas) {
        if (especie.equals("GATO")) {
            return new Gato(nome, raca, som, qtdPatas);
        }
        if (especie.equals("CACHORRO")) {
            return new Cachorro(nome, raca, som, qtdPatas);
        }
        if (especie.equals("VACA")) {
            return new Vaca(nome, raca, som, qtdPatas);
        }
        return new Animal(nome, som);
    }
}
