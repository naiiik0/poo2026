package labMascota;

public class Perro extends Mascota {
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println("guau");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("El nombre es " + nombre + " la edad es " + edad + " y la raza es " + raza);
    }
}
