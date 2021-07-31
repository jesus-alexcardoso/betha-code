package AulaDez;

public class Caminhao implements Veiculo, Motor{
    String modelo;
    String fabricante;
    String nomeMotor;
    String id;

    public Caminhao(String modelo, String fabricante, String nomeMotor, String id) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.nomeMotor = nomeMotor;
        this.id = id;
    }
    @Override
    public String getNomeMotor() {
        return nomeMotor;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", nomeMotor='" + nomeMotor + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
