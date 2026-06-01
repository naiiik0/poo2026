package ejPracticaC3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SistemaLog {
    private static SistemaLog unica_instancia;
    private SistemaLog() {

    }
    public static SistemaLog get_Instancia() {
        if(unica_instancia == null) {
            unica_instancia = new SistemaLog();
        }
        return unica_instancia;
    }

    public void escribirLog(String mensaje) {
        if (mensaje == null) {
            throw new IllegalArgumentException("No puede estar vacio el mensaje");
        }
        System.out.println("LOG: " +  mensaje);
    }

    public void guardarLogEnArchivo(String nombreArchivo, String mensaje) {
        PrintWriter salida = null;
        try {
            FileWriter fw = new FileWriter(nombreArchivo, true);
            salida = new PrintWriter(fw);
            salida.println("LOG: " + mensaje);
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        } finally {
            if (salida != null) {
                salida.close();
            }
        }
    }
}
