package ejSerializacion;

import java.io.*;
import java.util.ArrayList;

public class Serializable {
        public void grabaPersonas(ArrayList<Persona> lista) {
            try {
                // Preparamos el archivo de salida
                ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("personas.dat"));

                // IMPORTANTE: Guardamos persona por persona mediante un ciclo.
                // Esto es vital para que el while(true) de tu profe funcione al leer.
                for (Persona p : lista) {
                    salida.writeObject(p);
                }

                salida.close();
                System.out.println("Datos guardados exitosamente.");

            } catch (IOException e) {
                System.out.println("Error al guardar: " + e.getMessage());
            }
        }

        // B. Metodo para LEER (Exactamente como lo hace tu profe)
        public ArrayList<Persona> leePersonas() {
            ObjectInputStream archivo = null;
            ArrayList<Persona> personitas = new ArrayList<>();

            try {
                archivo = new ObjectInputStream(new FileInputStream("personas.dat"));

                // Bucle infinito: lee hasta que se acaban los objetos
                while (true) {
                    personitas.add((Persona) archivo.readObject());
                }

            } catch (EOFException e) {
                // El truco de tu profe: atrapa el Fin De Archivo (EOF) para salir del bucle
                try {
                    if (archivo != null) archivo.close();
                } catch (IOException ex) {
                    System.out.println("error al cerrar");
                }
            } catch (FileNotFoundException e) {
                System.out.println("El archivo aún no existe.");
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error de lectura: " + e.getMessage());
            }

            return personitas;
        }

        // C. METODO MAIN PARA PROBARLO
        public static void main(String[] args) {
            Serializable gestor = new Serializable();

            // 1. Creamos una lista y le añadimos personas
            ArrayList<Persona> listaOriginal = new ArrayList<>();
            listaOriginal.add(new Persona(20,  "jose", "perez"));
            listaOriginal.add(new Persona(21,  "sebastian", "lagos"));
            listaOriginal.add(new Persona(11,  "nicolas", "figueroa"));

            // 2. Guardamos la lista en el archivo
            gestor.grabaPersonas(listaOriginal);

            // 3. Leemos el archivo usando el metodo de tu profe
            ArrayList<Persona> listaRecuperada = gestor.leePersonas();

            // 4. Mostramos lo que recuperamos
            System.out.println("\n--- Personas recuperadas del archivo ---");
            for (Persona p : listaRecuperada) {
                System.out.println(p);
            }
        }
    }

