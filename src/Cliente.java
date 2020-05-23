public class Cliente {
    private String dni, nombre, direccion;

    public Cliente() {
    }

    public Cliente(String dni, String nombre, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni() {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion() {
        this.direccion = direccion;
    }
}