package AulaQuatro;

import java.util.Scanner;

public class EntradaDadosMain {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Digite uma linha: ");
        String linha = s.nextLine(); //lê uma frase
        System.out.println("Digite um número: ");
        Integer i = s.nextInt(); //lê um inteiro
        System.out.println("Digite um número: ");
        Double d = s.nextDouble(); //lê um ponto flutuante

        System.out.println("Imprime: linha: " + linha + " - inteiro: " + i + " - double: " + d);
    }
}
