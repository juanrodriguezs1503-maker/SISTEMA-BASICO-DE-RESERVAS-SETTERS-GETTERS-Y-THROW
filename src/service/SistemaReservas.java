package service;

import model.Reserva;
import java.util.ArrayList;

public class SistemaReservas {

    private ArrayList<Reserva> reservas = new ArrayList<>();
    public void agregarReserva(Reserva r) {
        reservas.add(r);
        System.out.println("Reserva agregada  (ID " + r.getId() + ")");
    }
    public void eliminarReserva(int id) throws Exception {
        boolean eliminada = false;

        for (Reserva r : reservas) {
            if (r.getId() == id) {
                reservas.remove(r);
                eliminada = true;
                System.out.println("Reserva con ID " + id + " eliminada.");
                break;
            }
        }

        if (!eliminada) {
            throw new Exception("No existe una reserva con ID " + id);
        }
    }

    // Listar reservas
    public void listarReservas() throws Exception {
        if (reservas.isEmpty()) {
            throw new Exception("No hay reservas registradas.");
        }

        System.out.println("\n--- LISTA DE RESERVAS ---");
        for (Reserva r : reservas) {
            r.mostrarInfo();
        }
    }

    public int contarReservas() {
        return reservas.size();
    }
}
