package ejSerializacion;
import java.io.Serializable;

public class Persona implements Serializable {
    private int edad;
    private String nombre;
    private String apellido;

    public Persona(int edad, String nombre, String apellido) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
