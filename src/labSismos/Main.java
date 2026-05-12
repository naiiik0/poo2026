package labSismos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Sismos> sismosList = new ArrayList<>();
        try {
            Sismos s1 = new Sismos("Ñuble", "Chillán", 6.5f);
            sismosList.add(s1);
            System.out.println("Sismos registrados:");
            for (Sismos s : sismosList) {
                System.out.println(s);
            }
            Sismos s2 = new Sismos("Biobío", "Concepción", 12);
            sismosList.add(s2);
        } catch (SismoInvalidoException e) {
            System.out.println("Error al registrar sismo: ");
            System.out.println(e.getMessage());
        }
    }
}
