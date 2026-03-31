package ejCadillac;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Vehiculo {
    private Categoria categoria;
    private int peso;
    private String color;
    private int potenciaMaxima;
    private LocalDate fechaPrimeraCarrera;
    private static String marca = "Cadillac";

    public Vehiculo(Categoria categoria, int peso, String color, int potenciaMaxima, LocalDate fechaPrimeraCarrera) {
        this.categoria = categoria;
        this.peso = peso;
        this.color = color;
        this.potenciaMaxima = potenciaMaxima;
        this.fechaPrimeraCarrera = fechaPrimeraCarrera;
    }
    public void restanteCarerra() {
        long dias = ChronoUnit.DAYS.between(LocalDate.now(), fechaPrimeraCarrera);
        System.out.println("Los dias restantes para la carrera son: " + dias);
    }
    public static void modificarMarca(String nuevaMarca) {
        marca = nuevaMarca;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "categoria=" + categoria +
                ", peso=" + peso +
                ", color='" + color + '\'' +
                ", potenciaMaxima=" + potenciaMaxima +
                ", fechaPrimeraCarrera=" + fechaPrimeraCarrera +
                '}';
    }
}
