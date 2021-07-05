package AulaQuatro;

import javax.swing.*;

public class Dialogo {
    public static void main (String[] args){
        String nome;

        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        String mensagem = nome + " está fazendo o curso Java Iniciante.";

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
