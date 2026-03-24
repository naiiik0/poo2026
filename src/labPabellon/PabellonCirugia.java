package labPabellon;

import java.util.Objects;

public class PabellonCirugia {
    private int numero;
    private String especialidad;
    private Estado estado;

    public PabellonCirugia(int num, String especialidad) {
        this.numero = num;
        this.especialidad = especialidad;
        this.estado = Estado.DISPONIBLE;
    }

    public int getNumero() {
        return numero;
    }

    public Estado getEstado() {
        return estado;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public String toString() {
        if (estado == Estado.DISPONIBLE) {
            return "El numero corresponde a " + numero + ", la especialidad es " + especialidad + ", y su estado es disponible";
        } else {
            return "El numero corresponde a " + numero + ", la especialidad es " + especialidad + ", y su estado es ocupado";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PabellonCirugia that = (PabellonCirugia) o;
        return numero == that.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }
}
