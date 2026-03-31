package labVetPlus;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PacienteMascota {
    private String nombreMascota;
    private Especie especie;
    private int pesoIdeal;
    private String nombreDueño;
    private LocalDate fechaProximaVacuna;
    private static String nombreRedVeterinaria = "VetPlus";

    public PacienteMascota(String nombreMascota, Especie especie, int pesoIdeal, String nombreDueño, LocalDate fechaProximaVacuna) {
        this.nombreMascota = nombreMascota;
        this.especie = especie;
        this.pesoIdeal = pesoIdeal;
        this.nombreDueño = nombreDueño;
        this.fechaProximaVacuna = fechaProximaVacuna;
    }
    public void diasParaVacuna() {
        long dias = ChronoUnit.DAYS.between(LocalDate.now(), fechaProximaVacuna);
        System.out.println("Los dias restantes para la vacuna son: " + dias);
    }
    public static void actualizarNombreRed(String nuevoNombre) {
        nombreRedVeterinaria = nuevoNombre;
    }

    @Override
    public String toString() {
        return "El nombre de la mascota es: " + nombreMascota + '\'' +
                ", la especie es: " + especie +
                ", el peso ideal es: " + pesoIdeal +
                ", el nombre del dueño es: " + nombreDueño + '\'' +
                ", la fecha de la proxima vacuna es: " + fechaProximaVacuna;
    }
}
