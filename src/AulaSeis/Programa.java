package AulaSeis;

public class Programa {
    public static void main(String[] args) {
        Documento doc1;
        doc1 = new Documento();

        doc1.codigo = 123456;
        doc1.nome = "Alfredo";
        doc1.foto = "Img1.png";
        doc1.dataNascimento = "20/05/1990";

        System.out.println("Código do documento: " + doc1.codigo + " \nNome: " + doc1.nome);
    }
}
