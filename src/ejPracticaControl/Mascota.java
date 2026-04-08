package ejPracticaControl;

public class Mascota {
    private String nombre;
    private int edad;
    private float peso;
    private TipoMascota tipo;
    private Sexo sexo;
    private static int nroMachosAdultos = 0;

    public Mascota(String nombre, int edad, float peso, TipoMascota tipo, Sexo sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.tipo = tipo;
        this.sexo = sexo;
        if (esAdulto() && sexo == Sexo.MACHO) {
            nroMachosAdultos++;
        }
    }

    public boolean esAdulto() {
        switch (tipo) {
            case PERRO:
                return edad >= 2;
            case GATO:
                return edad >= 1;
            case AVE:
                return edad >= 2;
            case REPTIL:
                return edad >= 5;
            default:
                return false;
        }
    }
    public float calculaDosisVacuna() {
        switch (tipo) {
            case PERRO:
                return (float) 5.0 * peso;
            case GATO:
                return (float) 4.0 * peso;
            case AVE:
                return (float) 1.0 * peso;
            case REPTIL:
                return (float) 0.5 * peso;
            default:
                return 0;
        }
    }
    @Override
    public String toString() {
        return nombre + ", " + edad + ", " + peso + ", " + tipo + ", " + sexo;
    }
    public static int getNroMachosAdultos() {
        return nroMachosAdultos;
    }
}
