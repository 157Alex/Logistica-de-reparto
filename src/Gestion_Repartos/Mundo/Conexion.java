package Gestion_Repartos.Mundo;

public class Conexion {
    private Pais origen;
    private Pais destino;
    private double distancia;
    private String tipomedio;

    public Conexion(Pais origen, Pais destino, double distancia, String tipomedio) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
        this.tipomedio = tipomedio;
    }
}
