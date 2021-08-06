package model;

import java.math.BigDecimal;

public class Cliente extends AbstractPessoa{

    private BigDecimal percentualDescontoMaximo;

    public Cliente(Long id, String nome, String cpf, String endereco, String telefone, BigDecimal percentualDescontoMaximo) {
        super(id, nome, cpf, endereco, telefone);
        this.percentualDescontoMaximo = percentualDescontoMaximo;
    }

    public BigDecimal getPercentualDescontoMaximo() {
        return percentualDescontoMaximo;
    }

    public void setPercentualDescontoMaximo(BigDecimal percentualDescontoMaximo) {
        this.percentualDescontoMaximo = percentualDescontoMaximo;
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getCpf() {
        return super.getCpf();
    }

    @Override
    public void setCpf(String cpf) {
        super.setCpf(cpf);
    }

    @Override
    public String getEndereco() {
        return super.getEndereco();
    }

    @Override
    public void setEndereco(String endereco) {
        super.setEndereco(endereco);
    }

    @Override
    public String getTelefone() {
        return super.getTelefone();
    }

    @Override
    public void setTelefone(String telefone) {
        super.setTelefone(telefone);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
