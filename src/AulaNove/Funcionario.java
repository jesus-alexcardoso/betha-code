package AulaNove;

public abstract class Funcionario {
    private String nome;
    private Double bonificacao;

    public Funcionario(String nome, Double bonificacao) {
        this.nome = nome;
        this.bonificacao = bonificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract Double getBonificacao();

    public void setBonificacao(Double bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", bonificacao=" + bonificacao +
                '}';
    }
}
