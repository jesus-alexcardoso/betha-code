package DesafioQuatro;

public class PessoaJuridicaModel extends PessoaModel{
    private String cnpj;
    private String inscricaoEstadual;
    private Integer cnae;

    public PessoaJuridicaModel(Integer id, String nome, String endereco, String telefone,
                               String cnpj, String inscricaoEstadual, Integer cnae) {
        super(id, nome, endereco, telefone);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.cnae = cnae;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public Integer getCnae() {
        return cnae;
    }

    public void setCnae(Integer cnae) {
        this.cnae = cnae;
    }

    @Override
    public String toString() {
        return "PessoaJuridicaModel{" +
                "nome= " + getNome() +
                ", cnpj='" + cnpj + '\'' +
                ", inscricaoEstadual='" + inscricaoEstadual + '\'' +
                ", cnae=" + cnae +
                '}';
    }

    @Override
    public String getDocumentoPrincipal() {
        return cnpj;
    }
}
