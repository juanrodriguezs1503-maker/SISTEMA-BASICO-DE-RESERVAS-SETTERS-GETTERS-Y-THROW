package model;

public class Reserva {

    private int id;
    private String cliente;
    private String fecha;
    private int duracionHoras;

    public Reserva(int id, String cliente, String fecha, int duracionHoras) {
        this.id = id;
        this.cliente = cliente;
        this.fecha = fecha;
        this.duracionHoras = duracionHoras;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void mostrarInfo() {
        System.out.println(
                " | Reserva ID: " + id +
                " | Cliente: " + cliente +
                " | Fecha: " + fecha +
                " | Duración: " + duracionHoras + " horas");
    }
}


