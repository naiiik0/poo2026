package ejAnimales;

public class Personas extends Animales {
    private int añosDeVida;
    private String colorDePelo;

    public Personas(String nombre, int peso, double estatura, int añosDeVida, String colorDePelo) {
        super(nombre, peso, estatura);
        this.añosDeVida = añosDeVida;
        this.colorDePelo = colorDePelo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Los años de vida son " + añosDeVida + " y su color de pelo es " + colorDePelo);
    }
}
