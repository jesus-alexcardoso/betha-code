package DesafioQuatro;

public class ClienteModel extends PessoaFisicaModel{
    private Double limiteCrediario = 0.00;
    private Double limiteUtilizado = 0.00;

    public ClienteModel(Integer id, String nome, String endereco, String telefone, String cpf, String rg, String sexo, Double limiteCrediario, Double limiteUtilizado) {
        super(id, nome, endereco, telefone, cpf, rg, sexo);
        this.limiteCrediario = limiteCrediario;
        this.limiteUtilizado = limiteUtilizado;
    }

    public Double getLimiteCrediario() {
        return limiteCrediario;
    }

    public void setLimiteCrediario(Double limiteCrediario) {
        this.limiteCrediario = limiteCrediario;
    }

    public Double getLimiteUtilizado() {
        return limiteUtilizado;
    }

    public void setLimiteUtilizado(Double limiteUtilizado) {
        this.limiteUtilizado = limiteUtilizado;
    }

    public void aumentarLimiteCrediario(Double aumentarLimiteCrediario){
        System.out.println("Limite anterior: " + limiteCrediario);
        limiteCrediario += aumentarLimiteCrediario;
        System.out.println("O novo limite no crediário do " + getNome() + " é de: " + limiteCrediario);
    }

    public void diminuirLimiteCrediario(Double diminuirLimiteCrediario){
        if((limiteCrediario - diminuirLimiteCrediario) < 0.00){
            System.out.println("Não é possível diminuir " + diminuirLimiteCrediario + " do limite atual do crediário. " +
                    "O limite máximo para diminuição do limite do crediário é: " + limiteCrediario);
        }else {
            System.out.println("Limite anterior: " + limiteCrediario);
            limiteCrediario -= diminuirLimiteCrediario;
            System.out.println("O novo limite no crediário do " + getNome() + " é de: " + limiteCrediario);
        }
    }

    @Override
    public String toString() {
        return "ClienteModel{" +
                "limiteCrediario=" + limiteCrediario +
                ", limiteUtilizado=" + limiteUtilizado +
                '}';
    }
}
