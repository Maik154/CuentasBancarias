import java.util.List;
import java.util.Scanner;

public class Alta {
    public static void añadirCliente(List<Cliente> clientes) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame DNI del cliente que quieres añadir: ");
        String dni = sc.nextLine();
        if (Busqueda.buscarCliente(dni, clientes) == null) {
            System.out.println("Dame nombre del cliente: ");
            String nombre = sc.nextLine();
            System.out.println("Dame dirección del cliente: ");
            String direccion = sc.nextLine();
            clientes.add(new Cliente(dni, nombre, direccion));
        }
    }

    public static void añadirCuentaPlazo(List<Cuenta> cuentas, List<Cliente> clientes) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame número de cuenta: ");
        String numero = sc.nextLine();
        if (Busqueda.buscarCuenta(numero, cuentas) == null) {
            System.out.println("Dame sucursal de cuenta: ");
            String sucursal = sc.nextLine();
            System.out.println("Dame intereses de cuenta: ");
            float intereses = Float.parseFloat(sc.nextLine());
            System.out.println("Dame deposito plazo: ");
            long depositoPlazo = Long.parseLong(sc.nextLine());
            System.out.println("Dame DNI del cliente dueño de la cuenta: ");
            String dni = sc.nextLine();
            Cliente cliente = Busqueda.buscarCliente(dni, clientes);
            if (cliente != null) {
                CuentaPlazo cuentaPlazo = new CuentaPlazo(numero, sucursal, intereses, depositoPlazo);
                cuentaPlazo.addCliente(cliente);
                cuentas.add(cuentaPlazo);
            } else {
                System.out.println("El cliente que estás intentando añadir a esta cuenta no existe.");
            }
        }

    }


}
