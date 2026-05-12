package ejPracticoException;

public class MainEj2 {
    public static void main(String[] args) {
        Usuario user1 = new Usuario(2);
        try {
            user1.setEdad(20);
            System.out.println("Edad registrada: " + user1.getEdad());
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
