import java.util.List;
import java.util.Scanner;

public class Baja {

    /*  public static void eliminarCliente(List<Cliente> clientes, Scanner sc) {
          Consulta.consultarClientes(clientes);
          System.out.println("Dame dni del cliente que quieres eliminar: ");
          String dni = sc.nextLine();
          Cliente cliente = Busqueda.buscarCliente(dni, clientes);
          if (cliente != null) {
              clientes.remove(cliente);
          }
          System.out.println("Ese cliente no existe.");
      }
  */

    public static void eliminarClienteDeUnaCuenta(List<Cuenta> cuentas, Scanner sc) {
        Consulta.consultarCuentas(cuentas);
        System.out.println("Dame número de la cuenta que quieras eliminar un cliente: ");
        String numero = sc.nextLine();
        Cuenta cuenta = Busqueda.buscarCuenta(numero, cuentas);
        if (cuenta != null) {
            Consulta.consultarClientesDeUnaCuenta(cuentas);
            System.out.println("Dame dni del cliente que quieres eliminar: ");
            String dni = sc.nextLine();
            Cliente cliente = Busqueda.buscarCliente(dni, cuenta.getClientesCuenta());
            if (cliente != null) {
                cuenta.getClientesCuenta().remove(cliente);
            } else {
                System.out.println("Ese cliente no existe en esta cuenta.");
            }
        } else {
            System.out.println("Esa cuenta no existe.");
        }
    }

    public static void eliminarCuenta(List<Cuenta> cuentas, Scanner sc, List<Cliente> clientes) {
        Consulta.consultarCuentas(cuentas);
        System.out.println("Dame número de la cuenta que quieres eliminar: ");
        String numero = sc.nextLine();
        Cuenta cuenta = Busqueda.buscarCuenta(numero, cuentas);
        if (cuenta != null) {
            cuentas.remove(cuenta);
            for (Cliente c : clientes) {
                for (Cuenta cu : c.getCuentas()) {
                    if (numero.compareToIgnoreCase(cu.getNumero()) == 0) {
                        c.getCuentas().remove(cu);
                    }
                }
            }
        } else {
            System.out.println("Esa cuenta no existe.");
        }
    }
}
