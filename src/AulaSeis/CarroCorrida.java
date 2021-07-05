package AulaSeis;

public class CarroCorrida {

    Integer numeroIdentificacao;
    Double velocidadeAtual = 0.0;
    Double velocidadeMaxima = 100.0;
    Piloto piloto;

    void ligar() {
        System.out.println("VRRRUUUmmm");
    }

    void desligar() {
        System.out.println("MMMMMmmmm");
    }

    void acelerar() {
        velocidadeAtual += 10 + piloto.habilidadePiloto * 0.1;

        if (velocidadeAtual > velocidadeMaxima) {
            velocidadeAtual = velocidadeMaxima;
        }
    }

    void frear(Integer intensidadeFreada) {
        if (intensidadeFreada > 100) {
            intensidadeFreada = 100;
        } else if (intensidadeFreada < 0) {
            intensidadeFreada = 0;
        }

        velocidadeAtual -= intensidadeFreada * 0.25;

        if (velocidadeAtual < 0) {
            velocidadeAtual = 0.0;
        }

    }
}
