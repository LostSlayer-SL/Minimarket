public class Empleado {
    private String nombre;
    private String dni;
    private String cargo;

    // Constructor
    public Empleado(String nombre, String dni, String cargo) {
        this.nombre = nombre;
        this.dni = dni;
        this.cargo = cargo;
    }

    // Métodos getters
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getCargo() {
        return cargo;
    }
}
