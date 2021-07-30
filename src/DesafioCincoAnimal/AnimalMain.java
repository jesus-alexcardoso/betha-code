package DesafioCincoAnimal;

public class AnimalMain {

    public static void main(String[] args) {
        Gato gato1 = new Gato("Falcão Negro", "Smile","RRRoar",4);
        Gato gato2 = new Gato("Félix", "Siames",4);
        Animal animal = AnimalBuilder.criarAnimal("GATO","Garfield","Orange", "Miauss", 4);
        Animal cachorro = AnimalBuilder.criarAnimal("CACHORRO", "Rinti", "Pintcher","RRau RRau", 4);
        Animal vaca = AnimalBuilder.criarAnimal("VACA", "Mimosa", "Angus", "Mmmuu", 4);

        System.out.println(gato1.getSom());
        System.out.println(gato2.getSom());
        System.out.println(animal.getSom());
        System.out.println(animal);
        System.out.println(vaca);
        System.out.println(cachorro.getSom());
        System.out.println(vaca.getSom());
    }
}
