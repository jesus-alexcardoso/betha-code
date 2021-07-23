package DesafioCinco;

public class FuncionarioMain {

    public static void main(String[] args) {

        FuncionarioModel funcionario = FuncionarioBuilder.criaFuncionario("COORDENADOR", 1,
                "Alex", "04696909975", 1000.00);

        System.out.println("Salario Bruto: "+ funcionario.getSalarioBruto());

        FolhaModel folhaJulho = new FolhaModel(1, funcionario, "15/07/2021");

        System.out.println("----------");
        folhaJulho.calcular();
        System.out.println("Salario Liquido:" + folhaJulho.getSalarioLiquido());


        FolhaModel folhaAgosto = new FolhaModel(2, funcionario, "15/08/2021");

        DescontoModel[] descontos = new DescontoModel[3];
        descontos[0] = new DescontoModel(1,"UNIMED",100.00);
        descontos[1] = new DescontoModel(2,"FARMACIA",250.00); //400,00
        descontos[2] = new DescontoModel(3,"SINDICATO",50.00);

        System.out.println("----------");
        folhaAgosto.calcular(descontos);
        System.out.println("Salario Liquido:" + folhaAgosto.getSalarioLiquido());

        FolhaModel folhaSetembro = new FolhaModel(3, funcionario, "15/09/2021");

        DescontoModel[] descontosSetembro = new DescontoModel[3];
        descontosSetembro[0] = new DescontoModel(1,"UNIMED",100.00);
        descontosSetembro[1] = new DescontoModel(2,"FARMACIA",250.00); //400,00
        descontosSetembro[2] = new DescontoModel(3,"SINDICATO",50.00);

        System.out.println("----------");
        folhaSetembro.calcular(descontosSetembro,1000.00);
        System.out.println("Salario Liquido:" + folhaSetembro.getSalarioLiquido());

        funcionario = FuncionarioBuilder.criaFuncionario("ANALISTA", 4,
                "Maria", "52643198700", 3200.00);

        System.out.println("----------");
        System.out.println("Salario Bruto do(a) " + funcionario.getNome() + ": "+ funcionario.getSalarioBruto());

        FolhaModel folhaOutubro = new FolhaModel(2,funcionario,"01/10/2021");

        DescontoModel[] descontosOutubro = new DescontoModel[1];
        descontosOutubro[0] = new DescontoModel(1,"UNIMED", 200.00);

        folhaOutubro.calcular(descontosOutubro,1000.00);
        System.out.println("Salario líquido do(a) " + funcionario.getNome() + ": " + folhaOutubro.getSalarioLiquido());
    }
}
