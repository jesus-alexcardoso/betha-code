package DesafioCinco;

public class CoordenadorModel extends FuncionarioModel {
    public CoordenadorModel(Integer id, String nome, String cpf, Double salarioBruto) {
        super(id, nome, cpf, salarioBruto);
    }

    public CoordenadorModel(Integer id, String nome, String cpf) {
        super(id, nome, cpf);
    }

    public CoordenadorModel(Integer id, String nome) {
        super(id, nome);
    }

    @Override
    public Double getSalarioBruto() {
        return super.getSalarioBruto() * 1.2;
    }
}
