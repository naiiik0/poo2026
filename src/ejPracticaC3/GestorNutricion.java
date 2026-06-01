package ejPracticaC3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GestorNutricion {
    public int calcularProteinaTotal() {
        int proteTotal = 0;
        try (Scanner lector = new Scanner(new File("dieta.txt"))) {
            System.out.println("Calculos de proteina");
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                String[] datos = linea.split(",");
                try {
                    String comida = datos[0];
                    int calorias = Integer.parseInt(datos[1].trim());
                    int proteinas = Integer.parseInt(datos[2].trim());
                    System.out.println("Comida: " + comida + " calorias: " + calorias + " proteinas: " +  proteinas);
                    proteTotal+= proteinas;
                } catch (NumberFormatException e) {
                    System.out.println("Numero ingresado en el formato incorrecto en la linea " + linea);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("La linea viene incompleta, linea " + linea);
                }
            }
        } catch(FileNotFoundException e) {
            System.out.println("El archivo no existe");
        }
        return proteTotal;
    }
}
