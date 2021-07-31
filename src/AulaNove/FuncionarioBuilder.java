package AulaNove;

public class FuncionarioBuilder {
    public static Funcionario criaFuncionario(String tipo, String nome, Double bonificacao) {
        if (tipo.equals("GERENTE")) {
            return new Gerente(nome, bonificacao);
        } else if (tipo.equals("DIRETOR")) {
            return new Diretor(nome, bonificacao);
        }else if (tipo.equals("PRESIDENTE")){
            return new Presidente(nome, bonificacao);
        }else if (tipo.equals("SECRETARIAAG")){
            return new SecretariaAgencia(nome, bonificacao);
        }else {
            return new SecretariaAdministrativa(nome, bonificacao);
        }
    }
}
