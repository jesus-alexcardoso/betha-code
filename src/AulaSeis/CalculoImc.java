package AulaSeis;

import javax.swing.*;

public class CalculoImc {
    public static void main(String[] args) {

        //Exercício: Criar uma classe de pessoa, com os atributos nome, cpf,
        // rg, altura, peso, data nascimento, filiação e por fim, calcular o IMC.

        JOptionPane.showMessageDialog(null, "Iniciando o programa de cálculo do IMC\n\n");

        Pessoa pessoa = new Pessoa();

        pessoa.nome = JOptionPane.showInputDialog("Informe o nome da pessoa: ");
        pessoa.altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do(a) " + pessoa.nome + " : "));
        pessoa.peso = Double.parseDouble(JOptionPane.showInputDialog("Agora, informe o peso dele(a): "));

        pessoa.calculoImc();

        JOptionPane.showMessageDialog(null, "O IMC do(a) " + pessoa.nome + " é: " + pessoa.imc);
    }
}
