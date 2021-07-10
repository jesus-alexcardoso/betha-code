package AulaSete;

public class ConstrucaoModel {
    private Double metragem;
    private Integer qtdBanheiros;
    private Integer qtdQuarto;

    public ConstrucaoModel(Double metragem, Integer qtdBanheiros, Integer qtdQuarto) {
        this.metragem = metragem;
        this.qtdBanheiros = qtdBanheiros;
        this.qtdQuarto = qtdQuarto;
    }

    public Double getMetragem() {
        return metragem;
    }

    public void setMetragem(Double metragem) {
        this.metragem = metragem;
    }

    public Integer getQtdBanheiros() {
        return qtdBanheiros;
    }

    public void setQtdBanheiros(Integer qtdBanheiros) {
        this.qtdBanheiros = qtdBanheiros;
    }

    public Integer getQtdQuarto() {
        return qtdQuarto;
    }

    public void setQtdQuarto(Integer qtdQuarto) {
        this.qtdQuarto = qtdQuarto;
    }

    @Override
    public String toString() {
        return "ConstrucaoModel{" +
                "metragem=" + metragem +
                ", qtdBanheiros=" + qtdBanheiros +
                ", qtdQuarto=" + qtdQuarto +
                '}';
    }
}
