package ejPunto;

public class DemoPunto {
    public static void main(String[] args) {
        Punto punto = new Punto (1,2);
        Punto punto2 = new Punto(2,2);
        System.out.println(punto);
        System.out.println("Su distancia al origen es: " + punto.distanciaAlOrigen());
        System.out.println(punto2);
        System.out.println("Su distancia al origen es: " + punto2.distanciaAlOrigen());
        System.out.println("¿Son iguales?");
        System.out.println(punto.equals(punto2));
        punto.traslada(2,8);
        System.out.println(punto);
    }
}
