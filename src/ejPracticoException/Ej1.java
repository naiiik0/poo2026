package ejPracticoException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int num1, num2, resultado;
            System.out.println("Ingrese el primer numero: ");
            num1 = scanner.nextInt();
            System.out.println("Ingrese el segundo numero: ");
            num2 = scanner.nextInt();
            resultado = num1 / num2;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        } catch (InputMismatchException e) {
            System.out.println(("Formato incorrecto, ingrese numeros"));
        }
    }
}
