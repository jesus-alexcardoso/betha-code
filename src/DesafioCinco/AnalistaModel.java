package DesafioCinco;

public class AnalistaModel extends FuncionarioModel {
    public AnalistaModel(Integer id, String nome, String cpf, Double salarioBruto) {
        super(id, nome, cpf, salarioBruto);
    }

    public AnalistaModel(Integer id, String nome, String cpf) {
        super(id, nome, cpf);
    }

    public AnalistaModel(Integer id, String nome) {
        super(id, nome);
    }

    @Override
    public Double getSalarioBruto() {
        return super.getSalarioBruto() * 1.10;
    }
}
