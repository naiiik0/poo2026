package ejLabMascota;

public class Mascota {
    protected String nombre;
    protected int edad;

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void hacerSonido() {
        System.out.println("La mascota hace: ");
    }
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " y la edad es: " + edad);
    }
}
