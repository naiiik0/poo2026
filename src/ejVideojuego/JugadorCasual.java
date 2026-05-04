package ejVideojuego;

public class JugadorCasual extends Jugador {
    private int horasJugadas;

    public JugadorCasual(String nombre, String alias, TipoJugador tipo, double puntajeBase, int horasJugadas) {
        super(nombre, alias, tipo, puntajeBase);
        this.horasJugadas = horasJugadas;
    }

    @Override
    public double calcularPuntaje() {
        return puntajeBase + (horasJugadas * 0.5);
    }

    @Override
    public boolean puedeClasificar() {
        if (calcularPuntaje() > 100) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getCategoria() {
        if (calcularPuntaje() < 80) {
            System.out.println("Principiante");
        } else if (calcularPuntaje() > 80 && calcularPuntaje() < 100) {
            System.out.println("Intermedio");
        } else if (calcularPuntaje() > 100) {
            System.out.println("Avanzado");
        }
        return "Puntaje invalido";
    }
}
