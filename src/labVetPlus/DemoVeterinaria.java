package labVetPlus;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoVeterinaria {
    public static void main(String[] args) {
        List<PacienteMascota> mascotas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Especie[] especies = {Especie.EXOTICO, Especie.FELINO, Especie.CANINO};
        LocalDate[] fechas = {
                LocalDate.of(2026, 4, 15),
                LocalDate.of(2026, 5, 10),
                LocalDate.of(2026, 6, 5)
        };
        String nombreMascota;
        int pesoIdeal;
        String nombreDueño;
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el nombre: ");
            nombreMascota = scanner.next();
            System.out.println("Ingrese el peso: ");
            pesoIdeal = scanner.nextInt();
            System.out.println("Ingrese el nombre del dueño: ");
            nombreDueño = scanner.next();
            PacienteMascota pacienteMascota = new PacienteMascota(nombreMascota, especies[i], pesoIdeal, nombreDueño, fechas[i]);
            mascotas.add(pacienteMascota);
        }
        int opcion;
        do {
            System.out.println("Ingrese la opcion de lo que desea realizar: ");
            System.out.println("1. Listar los pacientes");
            System.out.println("2. Mostrar dias restantes para la vacuna");
            System.out.println("3. Actualizar el nombre de la red corporativa");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    for (PacienteMascota mascota : mascotas) {
                        System.out.println(mascota);
                    }
                    break;
                case 2:
                    for (PacienteMascota mascota : mascotas) {
                        mascota.diasParaVacuna();
                    }
                    break;
                case 3:
                    PacienteMascota.actualizarNombreRed("Letirinaria");
                    System.out.println("Nombre modificado correctamente");
                    break;
            }
        } while (opcion != 0);
    }
}


