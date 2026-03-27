package ejLampara;

public class Lampara {
    private String marca;
    private int potencia;
    private Estado estado;

    public Lampara(String marca, int potencia, Estado estado) {
        this.marca = marca;
        this.potencia = potencia;
        this.estado = Estado.APAGADA;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public Estado getEstado() {
        return estado;
    }
    public void encender() {
        this.estado = Estado.ENCENDIDA;
    }

    public void apagar() {
        this.estado = Estado.APAGADA;
    }
}
