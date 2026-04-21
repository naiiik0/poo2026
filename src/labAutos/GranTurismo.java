package labAutos;

public class GranTurismo extends CocheDeCarreras {
    private int pesoExtraLastre;

    public GranTurismo(String marca, String modelo, int velocidadMaxima, int pesoExtraLastre) {
        super(marca, modelo, velocidadMaxima);
        this.pesoExtraLastre = pesoExtraLastre;
    }

    @Override
    public void competir() {
        if (pesoExtraLastre < 100) {
            System.out.println("El piloto gestiona el peso como todo un campeon");
        } else if (pesoExtraLastre > 100){
            System.out.println("El piloto está teniendo complicaciones con el peso");
        }
    }
}
