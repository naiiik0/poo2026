package ejEstudiante;

import java.util.Objects;

public class Estudiante {
    private String rut;
    private String nombre;
    private String email;
    private EstadoEstudiante estado;

    public Estudiante(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
        this.estado = EstadoEstudiante.NO_VIGENTE;
    }
    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EstadoEstudiante getEstado() {
        return estado;
    }

    public void setEstado(EstadoEstudiante nvoEstado) {
        this.estado = nvoEstado;
    }

    @Override
    public String toString() {
        return "Estudiante " +
                "rut='" + rut + '\'' +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", estado=" + estado +
                ' ';
    }

    public boolean equals(Object otro) {
        if (otro == null || getClass() != otro.getClass()) return false;
        Estudiante that = (Estudiante) otro;
        return Objects.equals(rut, that.rut) && Objects.equals(nombre, that.nombre) && Objects.equals(email, that.email) && estado == that.estado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rut, nombre, email, estado);
    }
}
