package ejArchivoTxt;
import java.io.*;
import java.util.*;

public class DemoRecetaMedica {

    public static void main(String[] args) {
        ArrayList<RecetaMedica> listaRecetas = new ArrayList<>();
        int medicamentosRepetidos = 0;

        File archivoRecetas = new File("recetas.txt");

        try (Scanner lector = new Scanner(archivoRecetas)) {
            if (lector.hasNextInt()) {
                int cantidadAProcesar = lector.nextInt();
                lector.nextLine();

                for (int i = 0; i < cantidadAProcesar && lector.hasNextLine(); i++) {
                    String linea = lector.nextLine();
                    String[] partes = linea.split("-");

                    if (partes.length >= 4) {
                        int nro = Integer.parseInt(partes[0]);
                        String fecha = partes[1];
                        String paciente = partes[2];

                        RecetaMedica receta = new RecetaMedica(nro, fecha, paciente);

                        for (int j = 3; j < partes.length; j++) {
                            String med = partes[j].trim();
                            if (!receta.addNombreMedicamento(med)) {
                                medicamentosRepetidos++;
                            }
                        }
                        listaRecetas.add(receta);
                    }
                }
            }

            System.out.println("Numero de medicamentos repetidos y no incluidos: " + medicamentosRepetidos);

            File archivoInforme = new File("informe.txt");
            generarInforme(listaRecetas, archivoInforme);

        } catch (FileNotFoundException e) {
            System.err.println("Error: El archivo " + archivoRecetas.getName() + " no existe.");
            System.exit(1);
        } catch (NumberFormatException e) {
            System.err.println("Error: Datos numericos mal formados en el archivo.");
            System.exit(1);
        } catch (Exception e) {
            System.err.println("Error critico: " + e.getMessage());
            System.exit(1);
        }
    }

    private static void generarInforme(ArrayList<RecetaMedica> recetas, File destino) {
        int contadorMentix = 0;
        try (PrintWriter escritor = new PrintWriter(new FileWriter(destino))) {
            escritor.println("RECETAS DEL AÑO 2022 QUE INCLUYEN MENTIX");
            escritor.printf("%-10s %-30s%n", "Nro Receta", "Nombre paciente");

            for (RecetaMedica r : recetas) {
                if (r.getFecha().endsWith("2022") && r.estaNombreMedicamento("Mentix")) {
                    escritor.printf("%-10d %-30s%n", r.getNumero(), r.getNombrePaciente());
                    contadorMentix++;
                }
            }

            escritor.println("Total recetas que incluyen Mentix: " + contadorMentix);
        } catch (IOException e) {
            System.err.println("Error al escribir en: " + destino.getName());
            System.exit(1);
        }
    }
}
