package ejVeterinaria;

public class Mascota {
    private String nombre;
    private String especie;
    private boolean atendida;

    public Mascota(String nombre, String especie, boolean atendida) {
        this.nombre = nombre;
        this.especie = especie;
        this.atendida = false;
    }

    public String getNombre() {
        return nombre;
    }
    public boolean isAtendida() {
        return atendida;
    }

}
