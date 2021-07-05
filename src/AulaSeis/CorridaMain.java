package AulaSeis;

public class CorridaMain {
    public static void main(String[] args) {
        CarroCorrida carroEquipeVelocidade = new CarroCorrida();
        CarroCorrida carroEquipeTrapaceiros = new CarroCorrida();

        Piloto pilotoEquipeVelocidade = new Piloto();
        Piloto pilotoEquipeTrapaceiros = new Piloto();

        pilotoEquipeVelocidade.nomePiloto = "AulaQuatro.Piloto 1";
        pilotoEquipeVelocidade.idadePiloto = 25;
        pilotoEquipeVelocidade.habilidadePiloto = 75;

        pilotoEquipeTrapaceiros.nomePiloto = "AulaQuatro.Piloto 2";
        pilotoEquipeTrapaceiros.idadePiloto = 27;
        pilotoEquipeTrapaceiros.habilidadePiloto = 65;

        carroEquipeVelocidade.piloto = pilotoEquipeVelocidade;
        carroEquipeTrapaceiros.piloto = pilotoEquipeTrapaceiros;

        carroEquipeVelocidade.numeroIdentificacao = 1;
        carroEquipeVelocidade.numeroIdentificacao = 2;

        carroEquipeVelocidade.ligar();
        carroEquipeTrapaceiros.ligar();

        carroEquipeVelocidade.acelerar();
        carroEquipeTrapaceiros.acelerar();

        carroEquipeVelocidade.acelerar();
        carroEquipeTrapaceiros.acelerar();

        carroEquipeVelocidade.acelerar();
        carroEquipeTrapaceiros.velocidadeAtual = 200.0;

        System.out.println("Velocidade do carro Equipe Velocidade: " + carroEquipeVelocidade.velocidadeAtual);
        System.out.println("Velocidade do carro da Equipe Trapaceiros: " + carroEquipeTrapaceiros.velocidadeAtual);

    }
}
