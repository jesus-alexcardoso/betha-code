package AulaSete;

public class CasaMain {

    public static void main (String[] args){

        Casa casa = new Casa("Artur Souza", 3,2,180.00);



        System.out.println(casa);

    }

    public static class Casa{
        private String endereco = "";
        private Integer qtdQuartos = 0;
        private Integer qtdSalas = 0;
        private Double metragem = 0.00;

        public Casa(String endereco, Integer qtdQuarto, Integer qtdSala, Double metragem) {
            this.endereco = endereco;
            this.qtdQuartos = qtdQuarto;
            this.qtdSalas = qtdSala;
            this.metragem = metragem;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public Integer getQtdQuarto() {
            return qtdQuartos;
        }

        public void setQtdQuarto(Integer qtdQuarto) {
            this.qtdQuartos = qtdQuarto;
        }

        public Integer getQtdSala() {
            return qtdSalas;
        }

        public void setQtdSala(Integer qtdSala) {
            this.qtdSalas = qtdSala;
        }

        public Double getMetragem() {
            return metragem;
        }

        public void setMetragem(Double metragem) {
            this.metragem = metragem;
        }

        @Override
        public String toString() {
            return "Casa{" +
                    "endereco='" + endereco + '\'' +
                    ", qtdQuartos=" + qtdQuartos +
                    ", qtdSalas=" + qtdSalas +
                    ", metragem=" + metragem +
                    '}';
        }
    }
}
