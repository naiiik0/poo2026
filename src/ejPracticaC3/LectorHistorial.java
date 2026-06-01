package ejPracticaC3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LectorHistorial {
    public void leerPartidas() {
        // 1. Usamos Try-with-resources con Scanner para que cierre el archivo solo
        try (Scanner lector = new Scanner(new File("partidas.txt"))) {

            System.out.println("--- Procesando Historial ---");

            // 2. Leemos línea por línea mientras el archivo tenga contenido
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();

                // 3. SEPARAMOS LOS DATOS: El split(",") corta el texto donde haya comas
                // y devuelve un arreglo: ["Ahri", "10", "2"]
                String[] datos = linea.split(",");

                // 4. EL SEGUNDO TRY-CATCH (¡La clave del éxito!)
                // Lo ponemos ADENTRO del ciclo. Así, si una línea falla,
                // atrapamos el error, pero el ciclo sigue con la siguiente línea.
                try {
                    String campeon = datos[0];
                    // parseInt intenta convertir el texto "10" al número 10
                    int kills = Integer.parseInt(datos[1]);
                    int deaths = Integer.parseInt(datos[2]);

                    System.out.println("Campeón: " + campeon + " | K/D: " + kills + "/" + deaths);

                } catch (NumberFormatException e) {
                    // Esta excepción salta cuando intentamos hacer Integer.parseInt("cinco")
                    System.out.println("  -> [ERROR DE FORMATO] saltando la línea: " + linea);
                } catch (ArrayIndexOutOfBoundsException e) {
                    // Por si alguna línea viene incompleta (ej: "Garen,5")
                    System.out.println("  -> [DATOS FALTANTES] saltando la línea: " + linea);
                }
            }

        } catch (FileNotFoundException e) {
            // Esta excepción es obligatoria: ¿Qué pasa si "partidas.txt" no existe?
            System.out.println("No se pudo encontrar el archivo 'partidas.txt'.");
        }
    }

    public static void main(String[] args) {
        LectorHistorial gestor = new LectorHistorial();
        gestor.leerPartidas();
    }
}

