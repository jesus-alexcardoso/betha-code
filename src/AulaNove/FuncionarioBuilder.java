package AulaNove;

public class FuncionarioBuilder {
    public static Funcionario criaFuncionario(String tipo, String nome, Double bonificacao) {
        if (tipo.equals("GERENTE")) {
            return new Gerente(nome, bonificacao);
        } else if (tipo.equals("DIRETOR")) {
            return new Diretor(nome, bonificacao);
        }else {
            return new Presidente(nome, bonificacao);
        }
    }
}
