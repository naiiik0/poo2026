package ejPracticaCert3;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GestorBitacora {
    private static final String NOMBRE_ARCHIVO = "bitacora.txt";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ejecutar = true;
        System.out.println("=== Gestor de Bitácora del Sistema ===");
        while (ejecutar) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Agregar nuevo registro");
            System.out.println("2. Leer bitácora completa");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            String opcion = scanner.nextLine();
            switch (opcion) {
                case "1":
                    System.out.print("Ingrese el mensaje para la bitácora: ");
                    String mensaje = scanner.nextLine();
                    agregarRegistro(mensaje);
                    break;
                case "2":
                    leerBitacora();
                    break;
                case "3":
                    System.out.println("Cerrando el gestor de bitácora. ¡Hasta pronto!");
                    ejecutar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
        scanner.close();
    }
    private static void agregarRegistro(String mensaje) {
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String marcaTiempo = ahora.format(formato);
        String registro = "[" + marcaTiempo + "] " + mensaje;
        try (FileWriter fw = new FileWriter(NOMBRE_ARCHIVO, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(registro);
            bw.newLine();
            System.out.println("Registro guardado con éxito.");
        } catch (IOException e) {
            System.err.println("Error de I/O al intentar escribir en el archivo: " + e.getMessage());
        }
    }

    private static void leerBitacora() {
        File archivo = new File(NOMBRE_ARCHIVO);
        if (!archivo.exists()) {
            System.out.println("La bitácora está vacía o el archivo aún no ha sido creado.");
            return;
        }
        System.out.println("\n--- Contenido de la Bitácora ---");
        try (FileReader fr = new FileReader(archivo);
             BufferedReader br = new BufferedReader(fr)) {
            String lineaActual;
            while ((lineaActual = br.readLine()) != null) {
                System.out.println(lineaActual);
            }
            System.out.println("--------------------------------");
        } catch (IOException e) {
            System.err.println("Error de I/O al intentar leer el archivo: " + e.getMessage());
        }
    }
}
