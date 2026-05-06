package ejException;
import java.util.Scanner;

public class IOEnteros {
    public static void main(String[] args) {
        Scanner tcld = new Scanner(System.in);
        int numero;
        numero = lee(tcld);
        System.out.println("\nEl numero leido fue: " + numero);
    }

    private static int lee(Scanner tcld) {
        String enteroStr;
        int entero;
        do {
            System.out.print("Ingrese un entero: ");
            enteroStr = tcld.next();
            try {
                entero = Integer.parseInt(enteroStr);
                return entero;
            }
            catch (NumberFormatException e) {
            System.out.println("\nError. Numero contiene caracteres no validos\n");
            }
        } while(true);
    }
}
