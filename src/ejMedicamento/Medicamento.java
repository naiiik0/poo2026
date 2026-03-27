package ejMedicamento;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Medicamento {
    private String nombre;
    private Tipo presentacion;
    private LocalDate fechaVencimiento;

    public Medicamento(String nom, Tipo pres, LocalDate fechVenc) {
        this.nombre = nom;
        this.presentacion = pres;
        this.fechaVencimiento = fechVenc;
    }

    public String getNombre() {
        return nombre;
    }
    public Tipo getPresentacion() {
        return presentacion;
    }
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    public int getDiasValidez() {
        return (int) ChronoUnit.DAYS.between(LocalDate.now(), fechaVencimiento);
    }
    public String toString() {
        return "El medicamento es: " + nombre + "\n" +
                "El tipo es: " + presentacion + "\n" +
                "Vence el dia: " + fechaVencimiento;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Medicamento that = (Medicamento) o;
        return Objects.equals(nombre, that.nombre) && presentacion == that.presentacion && Objects.equals(fechaVencimiento, that.fechaVencimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, presentacion, fechaVencimiento);
    }
}
