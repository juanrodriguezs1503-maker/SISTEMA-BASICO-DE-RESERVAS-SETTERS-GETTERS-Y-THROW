package app;

import model.Reserva;
import service.SistemaReservas;

public class Main {
    public static void main(String[] args) {

        SistemaReservas sistema = new SistemaReservas();


        Reserva r1 = new Reserva(1, "Maia Morales", "2023-10-25", 9);
        Reserva r2 = new Reserva(2, "Alberto Costa", "2025-12-11", 7);

        //-----------------------------------------------------------------------------------------------------------

        sistema.agregarReserva(r1);
        sistema.agregarReserva(r2);

        r1.setCliente("Juan Camilo Rodríguez");

        try {
            sistema.listarReservas();
        } catch (Exception e) {
            System.out.println("VUELVE A INTENTARLO: " + e.getMessage());
        }

        System.out.println("\nTotal de reservas: " + sistema.contarReservas());

        //-----------------------------------------------------------------------------------------------------------------------

        System.out.println("\nIntentando eliminar reserva con EL ID 3...");
        try {
            sistema.eliminarReserva(3);
        } catch (Exception e) {
            System.out.println("VUELVE A INTENTARLO: " + e.getMessage());
        }

        System.out.println("\nEliminando reserva con EL ID 1...");
        try {
            sistema.eliminarReserva(1);
        } catch (Exception e) {
            System.out.println("VUELVE A INTENTARLO: " + e.getMessage());
        }

        //------------------------------------------------------------------------------------------------------------------------------

        try {
            sistema.listarReservas();
        } catch (Exception e) {
            System.out.println("VUELVE A INTENTARLO: " + e.getMessage());
        }

        System.out.println("\nTotal reservas final: " + sistema.contarReservas());
    }
}
