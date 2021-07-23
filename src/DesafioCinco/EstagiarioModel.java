package DesafioCinco;

public class EstagiarioModel extends FuncionarioModel {
    public EstagiarioModel(Integer id, String nome, String cpf, Double salarioBruto) {
        super(id, nome, cpf, salarioBruto);
    }

    public EstagiarioModel(Integer id, String nome, String cpf) {
        super(id, nome, cpf);
    }

    public EstagiarioModel(Integer id, String nome) {
        super(id, nome);
    }

    @Override
    public Double getSalarioBruto() {
        return super.getSalarioBruto() * 1.05;
    }
}
