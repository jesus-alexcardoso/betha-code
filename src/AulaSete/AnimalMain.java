package AulaSete;

public class AnimalMain {
    public static void main (String[] args){

        Animal animal = new Animal();

        animal.nome = "Rinti";
        animal.peso = 12.0;
        animal.altura = 0.72;
        animal.som = "Au Au";

        System.out.println(animal.nome + " - " + animal.peso + " - " + animal.altura);

        animal.emitirSom();
        animal.pular(2.75);

    }

    public static class Animal{
        String nome;
        Double peso;
        Double altura;
        String som;

        public void emitirSom(){
            System.out.println("O animal faz: " + som);
        }

        public void pular(Double alturaPulo){
            System.out.println("O " + nome + " pula essa altura: " + alturaPulo + "m");
        }
    }
}
