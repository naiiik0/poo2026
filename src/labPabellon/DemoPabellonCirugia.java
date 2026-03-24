package labPabellon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoPabellonCirugia {
    public static void main(String[] args) {
        Scanner tcld = new Scanner(System.in);
        List<PabellonCirugia> pabellonCirugias = new ArrayList<>();
        PabellonCirugia pabellonCirugia = new PabellonCirugia(2,"Organos");
        int numero;
        String especialidad;

        for (int i = 0; i < 6; i++) {
            System.out.println("Ingrese el numero: ");
            numero = tcld.nextInt();
            System.out.println("Ingrese la especialidad: ");
            especialidad = tcld.next();
            PabellonCirugia p = new PabellonCirugia(numero,especialidad);
            pabellonCirugias.add(p);
        }
        for (int i = 0; i < pabellonCirugias.size(); i++) {
            if (i % 2 == 0) {
                pabellonCirugias.get(i).setEstado(Estado.OCUPADO);
            }
        }
        System.out.println("LISTA");
        for (int i = 0; i < pabellonCirugias.size(); i++) {
            System.out.println("Posición " + i + ": " + pabellonCirugias.get(i));
        }
        boolean sonIguales = false;
        for (int i = 0; i < pabellonCirugias.size(); i++) {
            for (int j = i + 1; j < pabellonCirugias.size(); j++) {
                if (pabellonCirugias.get(i).equals(pabellonCirugias.get(j))){
                    System.out.println("Son iguales en la posicion " + i + " y en la " + j);
                    sonIguales = true;
                }
            }
        }
        if (!sonIguales){
            System.out.println("No hay pabellones iguales");
        }
    }
}
