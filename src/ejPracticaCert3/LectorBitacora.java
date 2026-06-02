package ejPracticaCert3;

import java.io.*;

public class LectorBitacora {
    private String rutaArchivo;
    public LectorBitacora(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public void mostrarContenido() {
        File archivo = new File(this.rutaArchivo);
        if (!archivo.exists()) {
            System.out.println("El archivo no existe");
            return;
        }
        try (FileReader fr = new FileReader(archivo);
             BufferedReader br = new BufferedReader(fr)) {
            String linea;
            System.out.println("Iniciando lectura");
            while((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            System.out.println("Fin de lectura");
        }catch (IOException e) {
            System.out.println("Error al intentar cargar y leer: " +  e.getMessage());
        }
    }
}
