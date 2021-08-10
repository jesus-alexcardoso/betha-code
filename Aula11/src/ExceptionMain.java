import java.util.Scanner;

public class ExceptionMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o número: ");
        Integer numero = s.nextInt();

        try {
            if (numero > 10) {
                ValorMaiorQueOPermitido me = new ValorMaiorQueOPermitido("Valor maior que o permitido!");
                throw me;
            }

            if (numero < 3) {
                ValorMenorQueOPermitido me = new ValorMenorQueOPermitido("Valor menor que o permitido!");
                throw me;
            }
        } catch (Exception e) {
            System.out.println("Regra: " + e.getMessage());
        }
        System.out.println("Valor: " + numero);
    }
}
