package DesafioCinco;

public class FuncionarioBuilder {

    public static FuncionarioModel criaFuncionario(String tipo, int id, String nome, String cpf, Double salarioBruto){

        if (tipo.equals("ESTAGIARIO")){
            return new EstagiarioModel(id,nome,cpf,salarioBruto);
        }

        if (tipo.equals("ANALISTA")){
            return new AnalistaModel(id,nome,cpf,salarioBruto);
        }

        if (tipo.equals("ARQUITETO")){
            return new ArquitetoModel(id,nome,cpf,salarioBruto);
        }

        if (tipo.equals("COORDENADOR")){
            return new CoordenadorModel(id,nome,cpf,salarioBruto);
        }
        return new FuncionarioModel(id, nome);
    }
}
