package ejPracticaCert3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscritorBitacora {
    private String rutaArchivo;

    public EscritorBitacora(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public void agregarLinea(String texto) {
        try (FileWriter fw = new FileWriter(this.rutaArchivo,true);
        BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(texto);
            bw.newLine();
            System.out.println("Guardado exitoso");
        } catch (IOException e ) {
            System.out.println("Error al escribir y guardar" + e.getMessage());
        }
    }
}
