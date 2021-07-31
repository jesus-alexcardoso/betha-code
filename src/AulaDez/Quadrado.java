package AulaDez;

public class Quadrado implements FiguraGeometrica{
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public String getNomeFigura() {
        return "QUADRADO";
    }

    @Override
    public int getArea() {
        return lado * lado;
    }

    @Override
    public int getPerimtero() {
        return lado * 4;
    }
}
