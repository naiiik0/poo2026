package ejPracticaC3;

import java.io.Serializable;

public class Juego implements Serializable {
    private String titulo;
    private int horas_Jugadas;
    public Juego(String titulo, int horasJugadas) {
        titulo = this.titulo;
        horasJugadas = this.horas_Jugadas;
    }
    public String toString() {
        return "Titulo: " + titulo + " horas jugadas: " + horas_Jugadas;
    }
}
