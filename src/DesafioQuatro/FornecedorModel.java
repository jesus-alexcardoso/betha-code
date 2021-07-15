package DesafioQuatro;

public class FornecedorModel extends PessoaJuridicaModel{
    private String responsavel;
    private String observacao;

    public FornecedorModel(Integer id, String nome, String endereco, String telefone, String cnpj, String inscricaoEstadual, Integer cnae, String responsavel, String observacao) {
        super(id, nome, endereco, telefone, cnpj, inscricaoEstadual, cnae);
        this.responsavel = responsavel;
        this.observacao = observacao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "FornecedorModel{" +
                "responsavel='" + responsavel + '\'' +
                ", observacao='" + observacao + '\'' +
                '}';
    }
}
