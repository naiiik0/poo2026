package ejVideojuego;

public abstract class Jugador implements Puntuable, Clasificable {
    private String nombre;
    private String alias;
    private TipoJugador tipo;
    protected double puntajeBase;
    private double premio;

    public Jugador(String nombre, String alias, TipoJugador tipo, double puntajeBase) {
        this.nombre = nombre;
        this.alias = alias;
        this.tipo = tipo;
        this.puntajeBase = puntajeBase;
    }
    public String mostrarInfo() {
        return "Nombre: " + nombre + ", alias: " + alias + ", tipo: " + tipo + ", puntaje base: " + puntajeBase;
    }
    public double calcularPremio() {
        return premio - puntajeBase;
    }

    public double getPremio() {
        return premio;
    }

    @Override
    public abstract double calcularPuntaje();

    @Override
    public void mostrarPuntaje() {
        calcularPuntaje();
    }

    @Override
    public abstract boolean puedeClasificar();

    @Override
    public abstract String getCategoria();
}
