package ejAnimales;

public class Gatos extends Animales{
    private String raza;
    private String ojos;
    public Gatos(String nombre, int peso, double estatura, String raza, String ojos) {
        super(nombre, peso, estatura);
        this.raza = raza;
        this.ojos = ojos;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("La raza de su gato es " + raza + " y su color de ojos es " + ojos);
    }
}
