public class Cliente {
    private String nombre;
    private String dni;

    // Constructor
    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Métodos getters
    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return dni;
    }
}
