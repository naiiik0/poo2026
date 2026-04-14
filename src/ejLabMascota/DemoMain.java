package ejLabMascota;

public class DemoMain {
    public static void main(String[] args) {
        Mascota mas1 = new Perro("perrito", 5, "pitbull");
        Mascota mas2 = new Gato("simba", 1);
        mas1.hacerSonido();
        mas1.mostrarInfo();
        mas2.hacerSonido();
        mas2.mostrarInfo();
    }
}
