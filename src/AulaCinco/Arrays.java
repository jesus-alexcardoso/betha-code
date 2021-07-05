package AulaCinco;

public class Arrays {
    public static void main(String[] args) {

        int[] jogoSena;
        int[] outroJogosena = {23,12,55,02,07,19}; //aqui o array já é iniciado automaticamente
                                                  // e já possui o seu tamanho e valores definidos

        jogoSena = new int[6]; //inicializando o array e definindo o tamanho.

        jogoSena[0] = 23;
        jogoSena[1] = 12;
        jogoSena[2] = 55;
        jogoSena[3] = 02;
        jogoSena[4] = 07;
        jogoSena[5] = 19;

        for(int i = 0; i < jogoSena.length; i++){
            System.out.println("Jogo: " + jogoSena[i]);
        }
    }
}
