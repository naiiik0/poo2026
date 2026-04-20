package ejAnimales;

public class Cerdos extends Animales {
    private String lugarProcedencia;
    private int mesesDeVida;
    public Cerdos(String nombre, int peso, double estatura, String lugarProcedencia, int mesesDeVida) {
        super(nombre, peso, estatura);
        this.lugarProcedencia = lugarProcedencia;
        this.mesesDeVida = mesesDeVida;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Su lugar de procedencia es " + lugarProcedencia + " y sus meses de vida " + mesesDeVida);
    }
}
