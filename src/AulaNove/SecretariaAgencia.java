package AulaNove;

public class SecretariaAgencia extends Secretaria {
    public SecretariaAgencia(String nome, Double bonificacao) {
        super(nome, bonificacao);
    }

    @Override
    public Double getBonificacao() {
        return 80.00;
    }
}
