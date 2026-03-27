package ejEstudiante;

import java.util.Scanner;

public class DemoEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("11.111.111-1", "Laura Diaz");
        Scanner tcld = new Scanner(System.in);
        System.out.println(estudiante.toString());
        System.out.println("¿Que estado deseas aplicar al estudiante?");
        String nuevEstado = tcld.next();
    }
}
