import java.util.HashSet;

public class Consulta {
    public static void consultarClientes(HashSet<Cliente> clientes){
        for(Cliente c: clientes){
            System.out.println("Dni del cliente: " + c.getDni() +
            "\nNombre del cliente: " + c.getNombre() +
            "\nDirección del cliente: " + c.getDireccion());
        }
    }
    public static void consultarCuentas(HashSet<Cuenta> cuentas){
        for(Cuenta c: cuentas){
            System.out.println("Número de la cuenta: " + c.getNumero() +
            "\nSucursal de la cuenta: " +c.getSucursal());
        }
    }
    //Mirar cómo se hace la ordenación con Strings
}
