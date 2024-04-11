import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Transaccion {
    private Cliente cliente;
    private List<Producto> productos;
    private Date fecha;

    // Constructor
    public Transaccion(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.fecha = new Date();
    }

    // Método para agregar productos a la transacción
    public void agregarProducto(Producto producto, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            productos.add(producto);
        }
    }

    // Método para calcular el total de la transacción
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }
}
