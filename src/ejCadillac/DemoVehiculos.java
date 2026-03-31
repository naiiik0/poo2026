package ejCadillac;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoVehiculos {
    public static void main(String[] args) {
        List<Vehiculo> autos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Categoria[] categorias = {Categoria.WEC, Categoria.F1, Categoria.IMSA};
        LocalDate[] fechas = {
                LocalDate.of(2026, 5, 2),
                LocalDate.of(2026, 5, 15),
                LocalDate.of(2026, 6, 1)
        };
        int peso;
        String color;
        int potencia;
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el peso: ");
            peso = scanner.nextInt();
            System.out.println("Ingrese el color: ");
            color = scanner.next();
            System.out.println("Ingrese la potencia: ");
            potencia = scanner.nextInt();
            Vehiculo auto = new Vehiculo(categorias[i], peso, color, potencia, fechas[i]);
            autos.add(auto);
        }
        int opcion;
        do {
            System.out.println("Ingrese la opcion de lo que desea realizar : ");
            System.out.println("1. Listar los vehiculos");
            System.out.println("2. Mostrar dias restantes para el debut");
            System.out.println("3. Modificar la marca");
            opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                for (Vehiculo auto : autos) {
                    System.out.println(auto);
                }
                break;
            case 2:
                for (Vehiculo auto : autos) {
                    auto.restanteCarerra();
                }
                break;
            case 3:
                Vehiculo.modificarMarca("General Motors");
                System.out.println("Marca modificada.");
                break;
            }
        } while (opcion != 0);
    }
}
