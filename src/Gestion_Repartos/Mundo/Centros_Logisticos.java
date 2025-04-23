package Gestion_Repartos.Mundo;

public class Centros_Logisticos {
    private String nombre;
    private int capacidadMaxima;

    public Centros_Logisticos(String nombre, int capacidadMaxima) {
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        System.out.println("Centro logístico creado: " + nombre);
    }

    public String getNombre() {
        return nombre;
    }
}
