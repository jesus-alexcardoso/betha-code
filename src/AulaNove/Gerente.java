package AulaNove;

public class Gerente extends Funcionario{
    public Gerente(String nome, Double bonificacao) {
        super(nome, bonificacao);
    }

    @Override
    public Double getBonificacao() {
        return 150.00;
    }
}
