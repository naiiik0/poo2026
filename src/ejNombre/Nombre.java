package ejNombre;

public class Nombre {
    private String primerNombre;
    private String apellidoPaterno;
    private String apellidoMaterno;

    public Nombre (String primerNom, String apPat, String apMat) {
        this.primerNombre = primerNom;
        this.apellidoPaterno = apPat;
        this.apellidoMaterno = apMat;
    }
    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public char[] getIniciales() {
        return new char[]{
                primerNombre.charAt(0),
                apellidoPaterno.charAt(0),
                apellidoMaterno.charAt(0)
        };
    }
    private String mayus(String texto) {
        return texto.substring(0,1).toUpperCase() + texto.substring(1).toLowerCase();
    }
    @Override
    public String toString() {
        return  "El nombre es: " + mayus(primerNombre) + " " + mayus(apellidoPaterno) + " " + mayus(apellidoMaterno);
    }
    @Override
    public boolean equals(Object otro) {
        if (otro == null || getClass() != otro.getClass()) return false;
        Nombre nombre = (Nombre) otro;
        return primerNombre.equalsIgnoreCase(nombre.primerNombre) && apellidoPaterno.equalsIgnoreCase(nombre.apellidoPaterno) && apellidoMaterno.equalsIgnoreCase(nombre.apellidoMaterno);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(primerNombre, apellidoPaterno, apellidoMaterno);
    }
    // Metodos propios
    public char[] getFinales() {
        return new char[]{
                primerNombre.charAt(primerNombre.length()-1),
                apellidoPaterno.charAt(apellidoPaterno.length()-1),
                apellidoMaterno.charAt(apellidoMaterno.length()-1)
        };
    }
    public String nombreInvertido() {
        String nombreCompleto = primerNombre + " " + apellidoPaterno + " " + apellidoMaterno;
        return new StringBuilder(nombreCompleto).reverse().toString();
    }

}
