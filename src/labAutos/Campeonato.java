package labAutos;

import java.util.ArrayList;
import java.util.List;

public class Campeonato {
    public static void main(String[] args) {
        List<CocheDeCarreras> autos = new ArrayList<>();
        CocheDeCarreras turismo1 = new GranTurismo("Lamborghini", "Murcielago", 300, 40);
        CocheDeCarreras turismo2 = new GranTurismo("Porsche", "Carrera GT", 270, 110);
        CocheDeCarreras protoLm1 = new PrototipoLM("Chevrolet", "Camaro", 220, true);
        CocheDeCarreras protoLm2 = new PrototipoLM("Ford", "Mustang", 190, false);
        autos.add(turismo1);
        autos.add(turismo2);
        autos.add(protoLm1);
        autos.add(protoLm2);
        for (CocheDeCarreras v : autos) {
            System.out.println(v.mostrarDatos());
            v.competir();
        }
    }
}
