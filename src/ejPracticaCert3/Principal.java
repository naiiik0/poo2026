package ejPracticaCert3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String nombreArchivo = "bitacora_modular.txt";

        // Instanciamos nuestras herramientas separadas
        EscritorBitacora escritor = new EscritorBitacora(nombreArchivo);
        LectorBitacora lector = new LectorBitacora(nombreArchivo);

        Scanner scanner = new Scanner(System.in);
        boolean ejecutar = true;

        while (ejecutar) {
            System.out.println("1. Escribir/Guardar nuevo registro");
            System.out.println("2. Cargar/Leer registros existentes");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Ingresa el mensaje: ");
                    String mensaje = scanner.nextLine();

                    // Generamos la marca de tiempo
                    String fechaHora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                    String registroCompleto = "[" + fechaHora + "] " + mensaje;

                    // Usamos nuestra clase separada para escribir
                    escritor.agregarLinea(registroCompleto);
                    break;

                case "2":
                    // Usamos nuestra clase separada para leer
                    lector.mostrarContenido();
                    break;

                case "3":
                    System.out.println("Cerrando programa...");
                    ejecutar = false;
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }
        }
        scanner.close();
    }
}
