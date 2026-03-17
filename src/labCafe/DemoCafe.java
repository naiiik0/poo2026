package labCafe;

import java.util.Scanner;

public class DemoCafe {
    public static void main(String[] args) {
        Scanner tcld = new Scanner(System.in);
        String nomCafe;
        String tamanoCafe;
        double precCafe;
        System.out.println("Ingresa el nombre de tu cafe");
        nomCafe = tcld.next();
        System.out.println("Ingresa el tamaño de tu cafe");
        tamanoCafe = tcld.next();
        System.out.println("Ingresa el precio de tu cafe");
        precCafe = tcld.nextDouble();
        Cafe cafe = new Cafe(nomCafe, tamanoCafe, precCafe);
        cafe.mostrarTicket();
    }
}
