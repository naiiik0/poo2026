package ejArchivoTxt;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DemoRecetaMedica {
    public static void main(String[] args) {
        String nombreArchivoLectura = "recetas.txt";
        String nombreArchivoEscritura = "informe.txt";
        ArrayList<RecetaMedica> misRecetas = new ArrayList<>();
        File archivoRecetas =  new File(nombreArchivoLectura);
        Scanner lector = null;
        try {
            lector = new Scanner(archivoRecetas);
        } catch (FileNotFoundException e) {
            System.out.println("MATATE, NO EXISTE EL FILE");
        }
        int numeroRecetasValidas =  lector.nextInt();
        System.out.println("Numero Recetas validas: "+numeroRecetasValidas);
        int cont = 0;
        lector.nextLine(); //bota el salto de linea pendiente..
        while (lector.hasNextLine() && cont < numeroRecetasValidas) {
            String linea = lector.nextLine();
            String[] partes = linea.split("-");

            int numeroReceta = Integer.parseInt(partes[0]);
            String fechaLeida = partes[1];
            String nombrePaciente = partes[2];
            // para configurar la fecha... dará excepción??...
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fecha = LocalDate.parse(fechaLeida, formato);
            //creo el objeto..
            RecetaMedica medica =  new RecetaMedica(numeroReceta,nombrePaciente,fecha);

            // System.out.println("Número receta: " + numeroReceta);
            // System.out.println("Fecha: " + fecha);
            // System.out.println("Paciente: " + nombrePaciente);

            // System.out.println("Medicamentos:");
            for (int i = 3; i < partes.length; i++) {
                medica.addNombreMedicamento(partes[i]);
                // System.out.println(" - " + partes[i]);
            }
            misRecetas.add(medica);
            cont++;
        }
        lector.close();
        generarReporte(2022, "Mentix",misRecetas);

    }

    static void generarReporte(int year, String nomMedicamento,ArrayList<RecetaMedica> misRecetas) {
        //como generamos el reporte???
        //primero, que seria mas facil??
        File miArchivo = new File("informe.txt");
        PrintStream escritor = null;
        try {
            escritor = new PrintStream(miArchivo);
        } catch(FileNotFoundException e) {
            System.out.println("No existe el archivo");
        }
        escritor.println("RECETAS DEL AÑO " + year + " QUE INCLUYEN " + nomMedicamento);
        escritor.printf("%-12s %-30s%n", "Nro Receta", "Nombre paciente");
        for (RecetaMedica recet : misRecetas) {
            int anio = recet.getFecha().getYear();
            if(anio == 2022 && recet.estaNombreMedicamento("Mentix")) {
                escritor.printf("%-12d %-30s%n",
                        recet.getNroReceta(),
                        recet.getNombrePaciente());
            }
        }

    }
}

