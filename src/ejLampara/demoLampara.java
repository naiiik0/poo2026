package ejLampara;

public class demoLampara {
    public static void main(String[] args) {
        Lampara[] lamparas = new Lampara[10];
        String[] marcas = {"claro","negro", "azul","claro" , "negro", "azul","claro" , "negro", "azul", "celeste"};
        int potencias[] = {120,60,70,100,90,40,45,87,23,65};
        for (int i = 0; i < 10; i++) {
            lamparas[i] = new Lampara(marcas[i], potencias[i], Estado.ENCENDIDA);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(lamparas[i]);
        }
        int prendidas = 0;
        for (int i = 0; i < 10; i++) {
            if (lamparas[i].getEstado() == Estado.ENCENDIDA) {
                prendidas+= 1;
            }
        }
        System.out.println("La cantidad de lamparas encendidas es de: " + prendidas);

        int menorWatts = 0;
        for (int i = 0; i < 10; i++) {
            if (lamparas[i].getPotencia() < 80) {
                menorWatts+= 1;
            }
        }
        System.out.println("La cantidad de lamparas con potencia menor a 80w es de: " + menorWatts);


    }
}
