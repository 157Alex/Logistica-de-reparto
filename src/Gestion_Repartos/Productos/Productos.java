package Gestion_Repartos.Productos;

public class Productos {
    private int idProducto;
    private String nombreProducto;
    private int pesoProducto;
    private int cantidadProducto;
    private int precioProducto;
    private int volumenProducto;
    private String tipoProducto; //Se comparar para un almacenaje organizado en pilas, dependiedo del tipo

    public Productos(int idProducto, String nombreProducto, int pesoProducto, int cantidadProducto, int precioProducto, int volumenProducto, String tipoProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.pesoProducto = pesoProducto;
        this.cantidadProducto = cantidadProducto;
        this.precioProducto = precioProducto;
        this.volumenProducto = volumenProducto;
        this.tipoProducto = tipoProducto;
    }
}
