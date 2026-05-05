package labSelloDiscografico;

import java.util.ArrayList;
import java.util.List;

public class RegistroDisquera {
    private static RegistroDisquera instancia;
    private List<String> artistas;

    private RegistroDisquera() {
        artistas = new ArrayList<>();
    }
    public static RegistroDisquera getInstance() {
        if (instancia == null) {
            instancia = new RegistroDisquera();
        }
        return instancia;
    }

    public void registrarArtista(String nombre) {
        artistas.add(nombre);
    }

    public void mostrarArtistas() {
        System.out.println("=== ARTISTAS REGISTRADOS ===");
        for (String artista : artistas) {
            System.out.println("- " + artista);
        }
    }
}
