package Gestion_Repartos.Mundo;

import java.util.ArrayList;
import java.util.List;

public class Ciudad {

    private String nombre;
    private List<Centros_Logisticos> centros;

    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.centros = new ArrayList<>();
        System.out.println("Ciudad creada: " + nombre);
    }

    public void agregarCentro(Centros_Logisticos centro) {
        centros.add(centro);
        System.out.println("Centro logístico '" + centro.getNombre() + "' agregado a la ciudad " + nombre);
    }

    public String getNombre() {
        return nombre;
    }
}
