import java.util.Date;
import java.util.List;

public class Venta {
    private Cliente cliente;
    private Empleado empleado;
    private List<Producto> productos;
    private Date fecha;

    // Constructor
    public Venta(Cliente cliente, Empleado empleado, List<Producto> productos) {
        this.cliente = cliente;
        this.empleado = empleado;
        this.productos = productos;
        this.fecha = new Date();
    }

    // Métodos getters
    public Cliente getCliente() {
        return cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public Date getFecha() {
        return fecha;
    }

    // Método para calcular el total de la venta
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }
}
