package ejAnimales;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animales> listaAnimales = new ArrayList<>();
        System.out.println("Ingrese la cantidad de animales a procesar: ");
        int cantAnimales = scanner.nextInt();
        for (int i = 0; i < cantAnimales; i++) {
            System.out.println("Ingrese nombre, peso y estatura: ");
            String nombre = scanner.next();
            int peso = scanner.nextInt();
            double estatura = scanner.nextDouble();
            System.out.println("Ingrese el tipo de animal");
            System.out.println("1. Gato");
            System.out.println("2. Cerdo");
            System.out.println("3. Persona");
            int opcion = scanner.nextInt();
            if (opcion == 1) {
                System.out.println("Ingrese raza y color de ojos");
                String raza = scanner.next();
                String colorOjos = scanner.next();
                Animales gato = new Gatos(nombre, peso, estatura, raza, colorOjos);
                listaAnimales.add(gato);
            } else if (opcion == 2) {
                System.out.println("Ingrese lugar de procedencia y meses de vida");
                String lugarProcedencia = scanner.next();
                int mesesVida = scanner.nextInt();
                Animales cerdo = new Cerdos(nombre, peso, estatura, lugarProcedencia, mesesVida);
                listaAnimales.add(cerdo);
            } else if (opcion == 3) {
                System.out.println("Ingrese años de vida y color de pelo");
                int añosVida = scanner.nextInt();
                String colorPelo = scanner.next();
                Animales persona = new Personas(nombre, peso, estatura, añosVida, colorPelo);
                listaAnimales.add(persona);
            }
        }
        System.out.println("\n--- LISTA DE ANIMALES ---");
        for (Animales a : listaAnimales) {
            a.mostrarDatos();
        }
    }
}
