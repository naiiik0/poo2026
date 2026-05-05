package labSelloDiscografico;

public class Main {
        public static void main(String[] args) {
            RegistroDisquera departamentoMarketing = RegistroDisquera.getInstance();
            RegistroDisquera departamentoProduccion = RegistroDisquera.getInstance();
            departamentoMarketing.registrarArtista("Dua Lipa");
            departamentoMarketing.registrarArtista("The Weeknd");
            departamentoProduccion.registrarArtista("Rosalía");
            departamentoProduccion.mostrarArtistas();
            System.out.println();
            System.out.println(departamentoMarketing == departamentoProduccion);
        }
}
