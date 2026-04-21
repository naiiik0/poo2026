package labAutos;

public class PrototipoLM extends CocheDeCarreras{
    private boolean sistemaHibrido;

    public PrototipoLM(String marca, String modelo, int velocidadMaxima, boolean sistemaHibrido) {
        super(marca, modelo, velocidadMaxima);
        this.sistemaHibrido = sistemaHibrido;
    }

    @Override
    public void competir() {
        if (sistemaHibrido == true) {
            System.out.println("El sistema es hibrido");
        } else if (sistemaHibrido == false) {
            System.out.println("El sistema es de combustion");
        }
    }
}
