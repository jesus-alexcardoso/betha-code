package AulaQuatro;

public class ControleFluxoIfMain {
    public static void main(String[] args) {

        int ano = 2020;
        double altura = 1.4;
        double salario = 15000;

        if (ano < 0) {
            System.out.println("Não é um ano!");
        } else if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("É bissexto!");
        } else {
            System.out.println("Não é bissexto!");
        }

        if (10 == 20) {
            System.out.println("10 é igual a 20!");
        } else {
            System.out.println("10 é diferente de 20!");
        }

        if (altura < 1.5) {
            System.out.println("É baixinho.");
        } else {
            System.out.println("É alto.");
        }

        if (salario >= 15000) {
            System.out.println("É o Carrion.");
        } else {
            System.out.println("Não é o Carrion.");
        }
    }
}
