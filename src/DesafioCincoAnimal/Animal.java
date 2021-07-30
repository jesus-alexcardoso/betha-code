package DesafioCincoAnimal;

public class Animal {
    private String nome;
    private String raca;
    private String som;
    private Integer qtdPatas;

    public Animal(String nome, String raca, String som, Integer qtdPatas) {
        this.nome = nome;
        this.raca = raca;
        this.som = som;
        this.qtdPatas = qtdPatas;
    }

    public Animal(String nome, String raca, Integer qtdPatas) {
        new Animal(nome,raca, null, qtdPatas);
    }

    public Animal(String nome, Integer qtdPatas) {
        new Animal(nome, null, qtdPatas);
    }

    public Animal(String nome, String som) {
        new Animal(nome, som, null, null);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public Integer getQtdPatas() {
        return qtdPatas;
    }

    public void setQtdPatas(Integer qtdPatas) {
        this.qtdPatas = qtdPatas;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", som='" + som + '\'' +
                ", qtdPatas=" + qtdPatas +
                '}';
    }
}
