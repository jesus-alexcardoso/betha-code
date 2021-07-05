package AulaSeis;

import java.text.DecimalFormat;

public class Pessoa {
    String nome, cpf, filiacao, dataNascimento, rg;
    Double altura, peso, imc;

    DecimalFormat df = new DecimalFormat("#.##");

    void calculoImc(){
        imc = peso / (altura * altura);

        System.out.println("O IMC do " + nome + " é: " + imc);
    }
}
