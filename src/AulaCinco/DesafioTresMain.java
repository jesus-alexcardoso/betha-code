package AulaCinco;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class DesafioTresMain {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int exercicio;
        boolean sair = false;

        do {
            System.out.println("\n\n>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<\n" +
                    "Digite o número do exercício desejado: " + "\n" +
                    "1- Ver conteúdo Array[10]" + "\n" +
                    "2- Valor médio do array" + "\n" +
                    "3- Inverter array" + "\n" +
                    "4- Exibir dado digitado" + "\n" +
                    "5- Inverter parâmetros" + "\n" +
                    "6- Calcular IMC" + "\n" +
                    "7- Sair");
            System.out.print(">> ");
            exercicio = s.nextInt();

            switch (exercicio) {
                case 1:
                    //Exercício 1: Crie um programa que percorra um array de 10 posições
                    // e imprima o seu conteúdo

                    int[] conteudo = new int[10];

                    System.out.println("\nTabuada de 5");

                    for (int i = 0; i < conteudo.length; i++) {
                        conteudo[i] = 5 * i;
                        System.out.println("5 x " + i + " = " + conteudo[i]);
                    }
                    break;
                //Fim exercício 1.


                case 2:
                    //Exercício 2: Escreva um programa que some todos os valores
                    // contidos em um array de inteiros e calcule a média.

                    int[] soma = new int[10];

                    System.out.println("\nValor médio da tabuada de 10");

                    for (int i = 0; i < soma.length; i++) {
                        soma[i] = 10 * i;
                        System.out.println("10 x " + i + " = " + soma[i]);
                    }

                    System.out.println("Media dos valores: " + Arrays.stream(soma).average());
                    break;
                // Fim Exercício 2.


                case 3:
                    //Exercício 3: Faça um programa que inverta as posições de
                    // um array com 10 elementos.

                    int[] inverter = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

                    System.out.println("Valor original do array: ");
                   for(int i = 0; i < inverter.length; i++){
                        System.out.println("Conteudo: " + inverter[i]);
                    }

                    System.out.println("\nValores invertidos do array: ");
                    for (int i = inverter.length; i > 0; i--) {
                        System.out.println("Conteudo: " + inverter[i-1]);
                    }
                    break;
                //Fim exercício 3.

                case 4:
                    //Exercício 4: Faça um programa que receba entrada de dados  e
                    // informe ao usuário através de uma caixa de diálogo
                    // qual foi o dado passado.

                    String info;

                    info = JOptionPane.showInputDialog("Insira a informação: ");

                    JOptionPane.showMessageDialog(null,"A informação inserida foi: " + info);
                    break;
                //Fim exercício 4.

                case 5:
                    //Exercício 5: Desenvolva um programa que receba 10 parâmetros,
                    // inverta todas as posições e imprima o resultado.

                    int [] param = new int[3];
                    String resultado = " ";

                    JOptionPane.showMessageDialog(null,"Muito bem! \n\nVamos inserir 3 números." +
                            "\nDepois, inverteremos a sequência na qual foram inseridos.");

                    for (int i = 1; i < param.length + 1; i++){
                        param[i-1] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + i + " º número: "));
                    }

                    System.out.println("\nValores invertidos do array: ");
                    for (int i = param.length; i > 0; i--) {
                        JOptionPane.showMessageDialog(null, "O " + i +
                                "º valor informado foi: " + param[i-1]);
                    }
                    break;
                //Fim exercício 5.

                case 6:
                    //Exercício 6: Desenvolva um programa que calcule o IMC com
                    // telas gráficas usando JOptionPane.

                    double peso, altura;

                    peso = Double.parseDouble(JOptionPane.showInputDialog("Vamos calcular o IMC. \n\n" +
                                                                            "Informe o peso"));
                    altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));

                    double IMC = peso / (altura*altura);

                    JOptionPane.showMessageDialog(null,"O IMC é: " + IMC);
                    break;
                //Fim exercício 6.

                case 7:
                    sair = true;
                    break;

                default:
                    System.out.println("Exercício não encontrado. Por favor, tente novamente.");
            }
        } while (!sair);

    }
}