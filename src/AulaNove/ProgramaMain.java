package AulaNove;

public class ProgramaMain {

    public static void main(String[] args) {

        Funcionario funcionarioD = FuncionarioBuilder.criaFuncionario("DIRETOR", "ALEX", 1000.00);
        System.out.println("Total Bonificação Diretor: " + funcionarioD.getBonificacao());
        //#duvida: pq usou o 15% do gerente + 20% do diretor?

        Funcionario funcionarioG = FuncionarioBuilder.criaFuncionario("GERENTE", "LUANA", 1000.00);
        System.out.println("Total Bonificação Gerente: " + funcionarioG.getBonificacao());

        Funcionario funcionarioP = FuncionarioBuilder.criaFuncionario("PRESIDENTE", "IGOR", 1000.00);
        System.out.println("Total Bonificação Presidente: " + funcionarioP.getBonificacao());
    }
}
