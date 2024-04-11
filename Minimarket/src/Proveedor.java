public class Proveedor {
    private String nombre;
    private String contacto;

    // Constructor
    public Proveedor(String nombre, String contacto) {
        this.nombre = nombre;
        this.contacto = contacto;
    }

    // Métodos getters
    public String getNombre() {
        return nombre;
    }

    public String getContacto() {
        return contacto;
    }
}
