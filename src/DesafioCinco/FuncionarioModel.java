package DesafioCinco;

public class FuncionarioModel {

    private Integer id;
    private String nome;
    private String cpf;
    private Double salarioBruto;

    public FuncionarioModel(Integer id, String nome, String cpf, Double salarioBruto) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBruto = salarioBruto;
    }

    public FuncionarioModel(Integer id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public FuncionarioModel(Integer id, String nome) {
        //outra forma de criar o construtor. neste casao, este construtor está copiando o
        // primeiro construtor, que possui uma assinatura com 4 parâmetros
        new FuncionarioModel(id, nome, null, null);

        //se eu usasse o construtor abaixo, então, eu estaria copiando o copiador com a assinatura
        //de apenas 3 parâmetros
        //new FuncionarioModel(id, nome, null);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    @Override
    public String toString() {
        return "FuncionarioModel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salarioBruto=" + salarioBruto +
                '}';
    }
}
