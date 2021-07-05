package AulaQuatro;

import java.util.Scanner;

public class DesafioDoisMain {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int exercicio, x = 10, iteracao;
        boolean sair = false;

        do {
            System.out.println("\n\n>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<\n" +
                    "Digite o número do exercício desejado: " + "\n" +
                    "1- Dia da semana" + "\n" +
                    "2- While 20x" + "\n" +
                    "3- Do-While 20x" + "\n" +
                    "4- Inverter número" + "\n" +
                    "5- Trapézio" + "\n" +
                    "6- Quadrados do 15 ao 35" + "\n" +
                    "7- Sair");
            System.out.print(">> ");
            exercicio = s.nextInt();

            switch (exercicio) {
                case 1:
                    //Exercício 1: Implemente um programa que recebe um número de 1 a 7
                    //               e imprime o dia da semana correspondente.

                    System.out.print("Digite um número de 1 a 7 e descubra qual dia da semana ele representa: ");
                    int dia = s.nextInt();

                    switch (dia) {
                        case 1:
                            System.out.println("1- Domingo");
                            break;
                        case 2:
                            System.out.println("2- Segunda-feira");
                            break;
                        case 3:
                            System.out.println("3- Terça-feira");
                            break;
                        case 4:
                            System.out.println("4- Quarta-feira");
                            break;
                        case 5:
                            System.out.println("5- Quinta-feira");
                            break;
                        case 6:
                            System.out.println("6- Sexta-feira");
                            break;
                        case 7:
                            System.out.println("7- Sábado");
                            break;
                        default:
                            System.out.println("Dia da semana não reconhecido para o número >> " + dia + " <<");
                    }
                    break;
                //Fim exercício 1.


                case 2:
                    //Exercício 2: Escreva um laço while que execute 20 vezes, imprimindo o valor da variável x
                    //          que inicialmente está com valor 10.
                    iteracao = 10;

                    while (iteracao < 30) {
                        System.out.println("Valor da variável X: " + iteracao);
                        iteracao++;
                    }
                    break;
                // Fim Exercício 2.


                case 3:
                    //Exercício 3: Converta este laço do exercício anterior para um do-while.
                    iteracao = 10;
                    do {
                        System.out.println("Valor da variável X: " + iteracao);
                        iteracao++;
                    } while (iteracao < 30);
                    break;
                //Fim exercício 3.

                case 4:
                    //Exercício 4: Desenvolva um programa que solicita ao usuário um número
                    //              inteiro de no máximo 4 dígitos. Inverta esse número.
                    int numero;
                    String valor, invertido = "";

                    do {
                        System.out.print("Digite um número de até 4 dígitos: ");
                        numero = s.nextInt();
                    } while (numero < -9999 || numero > 9999);

                    valor = Integer.toString(numero);

                    for (int i = valor.length(); i > 0; i--) {
                        invertido = invertido + valor.substring(i - 1, i);
                    }

                    System.out.println("Valor original: " + valor);
                    System.out.println("Valor invertido: " + invertido);
                    break;
                //Fim exercício 4.

                case 5:
                    //Exercício 5: Implemente um programa para calcular a área de um trapézio,
                    //               onde: h = altura b = base menor B = base maior Área = (h.(b+B))/2

                    System.out.println("#Partiu calcularmos a área de um trapézio." +
                            " Para isso, insira as seguintes informações:");

                    System.out.print("Altura: ");
                    double altura = s.nextDouble();
                    System.out.print("Base menor: ");
                    double baseMenor = s.nextDouble();
                    System.out.print("Base maior: ");
                    double baseMaior = s.nextDouble();

                    System.out.println("E a área do trapézio a partir das suas informações é: " +
                            (altura * (baseMenor + baseMaior)) / 2);
                    break;
                //Fim exercício 5.

                case 6:
                    //Exercício 6: Faça um programa que imprima os quadrados dos números
                    //              inteiros ímpares entre 15 e 35

                    for (int i = 15; i < 36; i = i + 2) {
                        System.out.println("O quadrado de " + i + " é: " + i * i);
                    }

                    System.out.println("\n" + "ou..." + "\n");

                    for (int i = 15; i < 36; i++) {
                        if (i % 2 != 0) {
                            System.out.println("O quadrado de " + i + " é: " + i * i);
                        }
                    }
                    break;
                //Fim exercício 6.

                case 7:
                    sair = true;
                    break;

                default:
                    System.out.println("Exercício não encontrado. Por favor, tente novamente.");
            }
        }while(sair == false);
    }
}
