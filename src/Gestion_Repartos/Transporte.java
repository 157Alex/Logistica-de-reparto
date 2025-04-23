package Gestion_Repartos;

import java.lang.reflect.Array;

public class Transporte {
    private String idVehiculo;
    private String tipoVehiculo;
    private String estado;
    private double capacidadPeso;     // en kg
    private double capacidadVolumen;  // en m³
    private int velocidad;            // km/h
    private int precioHoras;          // €/hora

    public Transporte(String idVehiculo, String tipoVehiculo, String estado, double capacidadPeso, double capacidadVolumen,int velocidad, int precioHoras) {
        this.idVehiculo = idVehiculo;
        this.tipoVehiculo = tipoVehiculo;
        this.estado = estado;
        this.capacidadPeso = capacidadPeso;
        this.capacidadVolumen = capacidadVolumen;
        this.velocidad = velocidad;
        this.precioHoras = precioHoras;
    }

    public double calcularTiempo(double distancia) {
        return distancia / velocidad;
    }

    public double calcularCosto(double distancia) {
        return calcularTiempo(distancia) * precioHoras;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public String getEstado() {
        return estado;
    }

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public double getCapacidadPeso() {
        return capacidadPeso;
    }

    public double getCapacidadVolumen() {
        return capacidadVolumen;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    @Override
    public String toString() {
        return tipoVehiculo + " [" + idVehiculo + "] - Estado: " + estado +
                " | Capacidad: " + capacidadPeso + " kg, " + capacidadVolumen + " m³" +
                " | Velocidad: " + velocidad + " km/h | Costo: " + precioHoras + " €/h";
    }
}
