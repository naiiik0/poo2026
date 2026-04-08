package ejPracticaControl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClinicaVetApp {
    public static void main(String[] args) {
        List<Mascota> mascotas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int cantMascotas;
        String nombre;
        int edad;
        float peso;
        String tipoString;
        TipoMascota tipo;
        String sexoString;
        Sexo sexo;
        System.out.println("Ingrese cuantas mascotas son: ");
        cantMascotas = scanner.nextInt();
        for (int i = 0; i < cantMascotas; i++) {
            System.out.println("Ingrese el nombre de su mascota");
            nombre = scanner.next();
            System.out.println("Ingrese la edad de su mascota");
            edad = scanner.nextInt();
            System.out.println("Ingrese el peso de su mascota");
            peso = scanner.nextFloat();
            System.out.println("Ingrese el tipo de mascota");
            tipoString = scanner.next().toUpperCase();
            tipo = TipoMascota.valueOf(tipoString);
            System.out.println("Ingrese el sexo de su mascota");
            sexoString = scanner.next().toUpperCase();
            sexo = Sexo.valueOf(sexoString);
            Mascota m = new Mascota(nombre, edad, peso, tipo, sexo);
            mascotas.add(m);
        }
        System.out.println("La cantidad de machos adultos es de: " + Mascota.getNroMachosAdultos());
        System.out.println("La cantidad de frascos que se deben comprar es de: " );
        System.out.println("\n--- LISTA DE MASCOTAS ---" + LocalDate.now());
        System.out.println("Nombre, edad, peso, tipo, sexo");
        for (Mascota m : mascotas) {
            System.out.println(m);
        }

    }
}
