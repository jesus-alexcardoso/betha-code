package DesafioQuatro;

public class FuncionarioModel extends PessoaFisicaModel{
    private Double salarioBruto = 0.00;
    private Double salarioLiquido = 0.00;

    public FuncionarioModel(Integer id, String nome, String endereco, String telefone, String cpf, String rg, String sexo, Double salarioBruto, Double salarioLiquido) {
        super(id, nome, endereco, telefone, cpf, rg, sexo);
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(Double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public void dissidio(Double dissidio){
        salarioBruto += salarioBruto * (dissidio / 100);
        System.out.println("Salário bruto do " + getNome() + " atualizado com o dissidio ficou em: " + salarioBruto);
    }

    @Override
    public String toString() {
        return "FuncionarioModel{" +
                "nome=" + getNome() +
                ", salarioBruto=" + salarioBruto +
                ", salarioLiquido=" + salarioLiquido +
                '}';
    }
}
