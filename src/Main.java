public class Main {
    public static void main(String[] args) {
        // Crear algunos productos
        Producto producto1 = new Producto("Agua", 1.5, 20);
        Producto producto2 = new Producto("Pan", 0.8, 30);

        // Crear un cliente
        Cliente cliente = new Cliente("Juan", "12345678");

        // Realizar una transacción
        Transaccion transaccion = new Transaccion(cliente);
        transaccion.agregarProducto(producto1, 3);
        transaccion.agregarProducto(producto2, 2);

        // Imprimir el total de la transacción
        System.out.println("Total de la transacción: $" + transaccion.calcularTotal());
    }
}
