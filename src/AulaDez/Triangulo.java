package AulaDez;

public class Triangulo implements FiguraGeometrica{
    private int base;
    private int altura;
    private int ladoA;
    private int ladoB;
    private int ladoC;

    public Triangulo(int base, int altura, int ladoA, int ladoB, int ladoC) {
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(int ladoA, int ladoB, int ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public String getNomeFigura() {
        return "Triângulo";
    }

    @Override
    public int getArea() {
        return (base * altura) / 2;
    }

    @Override
    public int getPerimtero() {
        return ladoA + ladoB + ladoC;
    }
}
