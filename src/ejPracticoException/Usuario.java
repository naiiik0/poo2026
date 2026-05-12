package ejPracticoException;

public class Usuario {
    int edad;

    public Usuario(int edad) {
        this.edad = edad;
    }

    public void setEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad ingresada es invalida. Debe estar entre 0 y 120.");
        }
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
}
