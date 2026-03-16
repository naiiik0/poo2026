package ejRectangulo;

public class Rectangulo {
    private int ancho;
    private int largo;

    public Rectangulo(int ancho, int largo) {
        this.ancho = ancho;
        this.largo = largo;
    }
    public int area() {
        int totalArea = ancho * largo;
        return totalArea;
    }
    public int perimetro() {
        int totalPerimetro = (ancho+largo)*2;
        return totalPerimetro;
    }
}
