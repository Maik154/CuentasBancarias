import java.util.List;
import java.util.Scanner;

public class Modificacion {
    public static void cambiarDireccion(List<Cliente> clientes, Scanner sc) {
        Consulta.consultarClientes(clientes);
        System.out.println("Dame dni del cliente que le quieres cambiar la dirección: ");
        String dni = sc.nextLine();
        Cliente cliente = Busqueda.buscarCliente(dni, clientes);
        if (cliente != null) {
            System.out.println("Dame dirección nueva: ");
            String direccion = sc.nextLine();
            cliente.setDireccion(direccion);
        } else {
            System.out.println("El cliente no existe.");
        }
    }
}
