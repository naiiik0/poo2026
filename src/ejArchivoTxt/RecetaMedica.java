package ejArchivoTxt;

import java.util.ArrayList;

public class RecetaMedica {
    private int numero;
    private String fecha;
    private String nombrePaciente;
    private ArrayList<String> nombresMedicamentos;

    public RecetaMedica(int numero, String fecha, String nombrePaciente) {
        this.numero = numero;
        this.fecha = fecha;
        this.nombrePaciente = nombrePaciente;
        this.nombresMedicamentos = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public int getNroMedicamentos() {
        return nombresMedicamentos.size();
    }

    public boolean estaNombreMedicamento(String nombre) {
        for (String m : nombresMedicamentos) {
            if (m.equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }

    public boolean addNombreMedicamento(String nombre) {
        if (!estaNombreMedicamento(nombre)) {
            return nombresMedicamentos.add(nombre);
        }
        return false;
    }
}
