package ejPracticaC3;

import java.io.*;
import java.util.ArrayList;

public class GestorBiblioteca {
    public void guardar_Juegos(String nombre_archivo, ArrayList<Juego> lista) {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(nombre_archivo))) {

            // Guardamos JUEGO POR JUEGO (Necesario para que el while del profe funcione)
            for (Juego juego : lista) {
                salida.writeObject(juego);
            }
            System.out.println("Biblioteca guardada con éxito.");

        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }

    // LEER OBJETOS BINARIOS (El método de tu profesor)
    public ArrayList<Juego> cargar_Juegos(String nombre_archivo) {
        ArrayList<Juego> juegosRecuperados = new ArrayList<>();
        ObjectInputStream entrada = null;

        try {
            entrada = new ObjectInputStream(new FileInputStream(nombre_archivo));

            // Bucle infinito hasta que se acabe el archivo
            while (true) {
                // Leemos el objeto, lo forzamos a ser (Juego) y lo añadimos a la lista
                juegosRecuperados.add((Juego) entrada.readObject());
            }

        } catch (EOFException e) {
            // Llegamos al fin del archivo, cerramos el flujo
            try {
                if (entrada != null) entrada.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar el archivo.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe. Creando nueva biblioteca...");
        } catch (Exception e) {
            System.out.println("Error de lectura: " + e.getMessage());
        }

        return juegosRecuperados;
    }
}
