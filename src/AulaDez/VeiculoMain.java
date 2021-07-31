package AulaDez;

public class VeiculoMain {
    public static void main(String[] args) {
        Carro carro = new Carro("Zafira","Opel","VHC","2541986-ABC");
        System.out.println(carro);

        Caminhao caminhao = new Caminhao("Vespa", "VW","Taurus", "KSRHKRJHGES254-X");
        System.out.println(caminhao);

        Moto moto = new Moto("XT","Yamaha", "PowerShell", "SHLFKJSDF90-Z");
        System.out.println(moto);

        Onibus onibus = new Onibus("Passeio", "Scania", "Full","406S4S64DS");
        System.out.println(onibus);
    }
}
