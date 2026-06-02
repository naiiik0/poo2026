package labRegistroAsistencia;

import java.time.Duration;
import java.time.LocalTime;

public class ValidadorHorario {
    private static final LocalTime LIMITE_INGRESO = LocalTime.of(8, 30);
    private static final LocalTime LIMITE_SALIDA = LocalTime.of(17, 0);

    public static String evaluarAtraso(LocalTime horaRegistro) {
        if (horaRegistro.isAfter(LIMITE_INGRESO)) {
            return "Atraso";
        }
        return "";
    }
    public static String evaluarHorasExtra(LocalTime horaRegistro) {
        if(horaRegistro.isAfter(LIMITE_SALIDA)) {
            Duration diferencia = Duration.between(LIMITE_SALIDA, horaRegistro);
            long horas = diferencia.toHours();
            long minutos = diferencia.toMinutesPart();
            return String.format("Tiempo extra: " + horas, minutos);
        }
        return "";
    }
}
