package ejMedicamento;

import java.time.LocalDate;

public class DemoMed {
    public static void main(String[] args) {
        Medicamento med = new Medicamento("Paracetamol", Tipo.COMPRIMIDO, LocalDate.of(2026,05,20));
        System.out.println(med);
        System.out.println("Los dias de validez restantes son: " +med.getDiasValidez());
    }
}
