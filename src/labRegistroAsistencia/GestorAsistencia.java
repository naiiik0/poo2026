package labRegistroAsistencia;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class GestorAsistencia {
    private String obtenerFechaFormateada() {
        LocalDate hoy = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd_MM_yyyy");
        return hoy.format(formato);
    }

    public void registrarEvento(String rut, String nombre, String tipoEvento, LocalTime hora) {
        String fechaAct = obtenerFechaFormateada();
        String nombreArchivo;
        String etiquetaExtra = "";

        if (tipoEvento.equalsIgnoreCase("ingreso")) {
            nombreArchivo = "Ingreso_Empleados_Fecha_" + fechaAct + ".txt";
            etiquetaExtra = ValidadorHorario.evaluarAtraso(hora);
        } else {
            nombreArchivo = "Salida_Empleados_Fecha_" + fechaAct + ".txt";
            etiquetaExtra = ValidadorHorario.evaluarHorasExtra(hora);
        }

        String formatoHora = hora.format(DateTimeFormatter.ofPattern("HH:mm"));
        String registro = String.format("Rut: %s | Nombre: %s | Hora de %s: %s%s",
                rut, nombre, tipoEvento.toLowerCase(), formatoHora, etiquetaExtra);

        try (FileWriter fw = new FileWriter(nombreArchivo, true);
             BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write(registro);
            bw.newLine();
            System.out.println("-> Registro guardado con éxito en: " + nombreArchivo);

        } catch (IOException e) {
            System.err.println("Error de I/O al intentar escribir el registro: " + e.getMessage());
        }
    }
}