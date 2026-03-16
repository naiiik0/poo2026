package ejDado;

public class DemoDado {
    public static void main(String[] args) {
        Dado dado = new Dado();
        System.out.println("Lanzando dado...");
        dado.lanza();
        System.out.println("Salió el numero: " + dado.getCara());
    }
}
