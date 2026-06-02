package labRegistroAsistencia;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorAsistencia gestor = new GestorAsistencia();
        boolean ejecutar = true;

        System.out.println("=== Sistema de Registro de Asistencia ===");

        while (ejecutar) {
            System.out.println("\nSeleccione el evento a registrar:");
            System.out.println("1. Registrar Ingreso");
            System.out.println("2. Registrar Salida");
            System.out.println("3. Salir");
            System.out.print("Opción: ");

            String opcion = scanner.nextLine();

            if (opcion.equals("3")) {
                System.out.println("Cerrando sistema...");
                ejecutar = false;
                continue;
            }

            if (opcion.equals("1") || opcion.equals("2")) {
                String tipoEvento = opcion.equals("1") ? "ingreso" : "salida";

                System.out.print("Ingrese RUT (ej. 12.345.678-9): ");
                String rut = scanner.nextLine();

                System.out.print("Ingrese Nombre y Apellido: ");
                String nombre = scanner.nextLine();

                System.out.print("Ingrese la hora de " + tipoEvento + " (formato HH:mm, ej. 08:45): ");
                String horaStr = scanner.nextLine();

                try {
                    LocalTime horaRegistro = LocalTime.parse(horaStr);
                    gestor.registrarEvento(rut, nombre, tipoEvento, horaRegistro);
                } catch (DateTimeParseException e) {
                    System.out.println("Error: El formato de la hora es incorrecto. Debe ser HH:mm.");
                }
            } else {
                System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }
}