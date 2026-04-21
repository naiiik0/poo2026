package labAutos;

public abstract class CocheDeCarreras {
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    public CocheDeCarreras(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    public abstract void competir();

    public String mostrarDatos() {
        return "Marca: " + marca + ", modelo: " + modelo + ", velocidad maxima: " + velocidadMaxima;
    }
}
