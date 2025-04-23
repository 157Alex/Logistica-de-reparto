package Gestion_Repartos.Mundo;

import java.util.ArrayList;
import java.util.List;

public class Mundo {
    private List<Pais> paises;
    private List<Conexion> conexiones;

    public Mundo() {
        paises = new ArrayList<>();
        conexiones = new ArrayList<>();
    }

    public void agregarPais(Pais pais) {
        paises.add(pais);
        System.out.println("País agregado al mundo: " + pais.getNombre());
    }

    public void conectarPaises(Pais origen, Pais destino, double distancia, String tipomedio) {
        Conexion conexion = new Conexion(origen, destino, distancia, tipomedio);
        conexiones.add(conexion);
    }

    public Pais buscarPaisPorNombre(String nombre) {
        for (Pais pais : paises) {
            if (pais.getNombre().equalsIgnoreCase(nombre)) {
                return pais;
            }
        }
        return null;
    }
}
