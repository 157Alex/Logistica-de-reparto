package Gestion_Repartos.Mundo;

import Gestion_Repartos.Transporte;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nombre;
    private List<Ciudad> ciudades;
    private List<ConexionCiudad> conexionesInternas = new ArrayList<>();

    public Pais(String nombre) {
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
        System.out.println("País creado: " + nombre);
    }

    public void agregarCiudad(Ciudad ciudad) {
        ciudades.add(ciudad);
        System.out.println("Ciudad " + ciudad.getNombre() + " agregada a " + nombre);
    }

    public void agregarConexionCiudad(ConexionCiudad conexion) {
        conexionesInternas.add(conexion);
    }

    public void conectarCiudadesBidireccional(Ciudad a, Ciudad b, double distancia, String tipomedio) {
        agregarConexionCiudad(new ConexionCiudad(a, b, distancia, tipomedio));
        agregarConexionCiudad(new ConexionCiudad(b, a, distancia, tipomedio));
    }

    public String getNombre() {
        return nombre;
    }
}
