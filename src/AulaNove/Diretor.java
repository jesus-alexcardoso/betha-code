package AulaNove;

public class Diretor extends Gerente{
    public Diretor(String nome, Double bonificacao) {
        super(nome, bonificacao);
    }

    @Override
    public Double getBonificacao() {
        return 120.00;
    }
}
