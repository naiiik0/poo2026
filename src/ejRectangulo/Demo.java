package ejRectangulo;

public class Demo {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(2,6);
        System.out.println("El area del rectangulo es " + rectangulo.area());
        System.out.println("El perimetro del rectangulo es " + rectangulo.perimetro());
    }
}
