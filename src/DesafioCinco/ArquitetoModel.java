package DesafioCinco;

public class ArquitetoModel extends FuncionarioModel {
    public ArquitetoModel(Integer id, String nome, String cpf, Double salarioBruto) {
        super(id, nome, cpf, salarioBruto);
    }

    public ArquitetoModel(Integer id, String nome, String cpf) {
        super(id, nome, cpf);
    }

    public ArquitetoModel(Integer id, String nome) {
        super(id, nome);
    }

    @Override
    public Double getSalarioBruto() {
        return super.getSalarioBruto() * 1.15;
    }
}
