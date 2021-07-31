package AulaDez;

public class FiguraMain {

    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(10);
        System.out.println("Nome figura: " + quadrado.getNomeFigura());
        System.out.println("Area: " + quadrado.getArea());
        System.out.println("Perímetro: " + quadrado.getPerimtero());

        System.out.println("-----------------");

        Triangulo triangulo = new Triangulo(10,5,2,2,3);
        System.out.println("Nome figura: " + triangulo.getNomeFigura());
        System.out.println("Área: " + triangulo.getArea());
        System.out.println("Perímetro: " + triangulo.getPerimtero());
    }
}
