package ejArchivoTxt;

import java.time.LocalDate;
import java.util.ArrayList;

public class RecetaMedica {
    private int nroReceta;
    private String nombrePaciente;
    private LocalDate fecha;
    private ArrayList<String> nombreMedicamentos;

    public RecetaMedica(int numero, String nombre, LocalDate fecha){
        nroReceta =  numero;
        nombrePaciente =  nombre;
        this.fecha = fecha;
        nombreMedicamentos =  new ArrayList<>();
    }

    public int getNroReceta(){return nroReceta;}
    public String getNombrePaciente(){return nombrePaciente;}
    public LocalDate getFecha(){return fecha;}

    public int getNroMedicamentos(){return nombreMedicamentos.size();}
    public boolean estaNombreMedicamento(String nombreMedicamento){
        for(String nombre: nombreMedicamentos){
            if(nombre.equalsIgnoreCase(nombreMedicamento)){
                return true;
            }
        }
        return false;
    }
    public boolean addNombreMedicamento(String nomMedicamento){
        for(String nombre: nombreMedicamentos){
            if(nombre.equalsIgnoreCase(nomMedicamento)){
                return false;
            }
        }
        return nombreMedicamentos.add(nomMedicamento);
    }
    public String[] getNombreMedicamentos(){
        return nombreMedicamentos.toArray(new String[0]);
    }


}
