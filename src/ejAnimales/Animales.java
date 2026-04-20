package ejAnimales;

public abstract class Animales {
    private String nombre;
    private int peso;
    private double estatura;

    public Animales(String nombre, int peso, double estatura) {
        this.nombre = nombre;
        this.peso = peso;
        this.estatura = estatura;
    }

    public void mostrarDatos(){
        System.out.println("El nombre es " + nombre + ", el peso es " + peso + " y su estatura es " + estatura);
    }
}