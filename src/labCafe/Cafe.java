package labCafe;

public class Cafe {
    private String nombre;
    private String tamano;
    private double precio;

    public Cafe(String nombre, String tamano, double precio) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.precio = precio;
    }
    public void mostrarTicket() {
        System.out.println("Nombre del cafe: " + nombre);
        System.out.println("Tamaño del cafe: " + tamano);
        System.out.println("Precio del cafe: " + precio);
    }
}
