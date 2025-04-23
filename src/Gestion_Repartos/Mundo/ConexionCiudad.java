package Gestion_Repartos.Mundo;

import Gestion_Repartos.Transporte;

public class ConexionCiudad {
    private Ciudad origen;
    private Ciudad destino;
    private double distancia; // en km
    private String tipomedio;

    public ConexionCiudad(Ciudad origen, Ciudad destino, double distancia, String tipomedio) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
        this.tipomedio = tipomedio;
    }

}
