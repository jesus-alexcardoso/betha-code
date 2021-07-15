package DesafioQuatro;

import java.util.Scanner;

public class PessoaMain {
    public static void main (String[] args){

        FuncionarioModel funcionario = new FuncionarioModel(1,
                "Alex",
                "Artur Souza",
                "48996181134",
                "05499676992",
                "4881200",
                "M",
                1300.00,
                1200.00);

        System.out.println(funcionario);

        //Salário bruto do funcionário atualizado a partir do percentual de dissídio
        // informado pelo usuário do sistema;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o percentual de dissídio para o " + funcionario.getNome() + ": ");
        double dissidio = s.nextDouble();
        System.out.println("Salário anterior: " + funcionario.getSalarioBruto());
        funcionario.dissidio(dissidio);

        //Fim do Funcionário

        //Início Cliente
        ClienteModel cliente = new ClienteModel(2,
                "Abinadabe",
                "Votorantim",
                "4834427648",
                "12345678901",
                "2546X",
                "M",
                2500.00,
                2000.00);

        System.out.println("-------");
        System.out.println("Informe o valor a ser acrescido no crediário do " + cliente.getNome() + ": ");
        double acrescimoCrediario = s.nextDouble();
        cliente.aumentarLimiteCrediario(acrescimoCrediario);

        System.out.println("-------");
        System.out.println("Informe o valor a ser diminuído no crediário do " + cliente.getNome() + ": ");
        double diminuirCrediario = s.nextDouble();
        cliente.diminuirLimiteCrediario(diminuirCrediario);
    }
}
