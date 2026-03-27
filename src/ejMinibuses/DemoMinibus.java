package ejMinibuses;

public class DemoMinibus {
    public static void main(String[] args) {
        Minibus minibus1 = new Minibus("AJ4536", 24);
        Minibus minibus2 = new Minibus("GZ9812", 20);
        System.out.println("Datos primer minibus");
        System.out.println("La patente es: " + minibus1.getLicensePlate());
        System.out.println("El numero de asientos ocupados es: " + minibus1.getOccupiedSeatsNumber());
        System.out.println("El estado del bus es: " + minibus1.getState());

        System.out.println("Datos segundo minibus");
        System.out.println("La patente es: " + minibus2.getLicensePlate());
        System.out.println("El numero de asientos ocupados es: " + minibus2.getOccupiedSeatsNumber());
        System.out.println("El estado del bus es: " + minibus2.getState());
        System.out.println("El valor del pasaje es: " + Minibus.getTicketValue());
        minibus1.takeSeats(10);
        Minibus.setTicketValue(480);
        minibus2.takeSeats(5);
        minibus2.setState(State.DECOMMISSIONED);
        minibus1.releaseSeats(3);
        System.out.println("Datos primer minibus");
        System.out.println("La patente es: " + minibus1.getLicensePlate());
        System.out.println("El numero de asientos ocupados es: " + minibus1.getOccupiedSeatsNumber());
        System.out.println("El estado del bus es: " + minibus1.getState());

        System.out.println("Datos segundo minibus");
        System.out.println("La patente es: " + minibus2.getLicensePlate());
        System.out.println("El numero de asientos ocupados es: " + minibus2.getOccupiedSeatsNumber());
        System.out.println("El estado del bus es: " + minibus2.getState());
        System.out.println("El valor del pasaje es: " + Minibus.getTicketValue());
    }

}
