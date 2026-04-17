package labMascota;

public class Gato extends Mascota {
    private boolean esDeInterior;
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("miau");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nombre " + nombre + " y la edad es " + edad + " y es de casa " + esDeInterior);
    }
}
