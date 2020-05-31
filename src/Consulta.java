import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Consulta {
    public static void consultarClientes(List<Cliente> clientes) {
        for (Cliente c : clientes) {
            System.out.println("Dni del cliente: " + c.getDni() +
                    "\nNombre del cliente: " + c.getNombre() +
                    "\nDirección del cliente: " + c.getDireccion());
        }
    }

    public static void consultarCuentas(List<Cuenta> cuentas) {
        for (Cuenta c : cuentas) {
            System.out.println("Número de la cuenta: " + c.getNumero() +
                    "\nSucursal de la cuenta: " + c.getSucursal());
        }
    }

    public static void consultarClientesDeUnaCuenta(List<Cuenta> cuentas) {
        Scanner sc = new Scanner(System.in);
        consultarCuentas(cuentas);
        System.out.println("Dame número de cuenta que quieres ver sus clientes: ");
        String numero = sc.nextLine();
        Cuenta cuenta = Busqueda.buscarCuenta(numero, cuentas);
        if (cuenta != null) {
            for (Cliente c : cuenta.getClientesCuenta()) {
                System.out.println("Dni del cliente: " + c.getDni() +
                        "\nDirección del cliente: " + c.getDireccion() +
                        "\nNombre del cliente: " + c.getNombre());
            }
        } else {
            System.out.println("Esta cuenta no existe.");
        }
    }

    public static void consultarCuentasDeUnCliente(List<Cliente> clientes, Collection<Cuenta> cuentas) {
        Scanner sc = new Scanner(System.in);
        consultarClientes(clientes);
        System.out.println("Dame dni del cliente que quieres ver sus cuentas: ");
        String dni = sc.nextLine();
        Cliente cliente = Busqueda.buscarCliente(dni, clientes);
        if (cliente != null) {
            for (Cuenta c : cliente.getCuentas()) {
                System.out.println("Número de la cuenta: " + c.getNumero() +
                        "\nSucursal de la cuenta: " + c.getSucursal());
            }
        } else {
            System.out.println("Este cliente no existe");
        }
    }

    public static void consultarMovimientos(List<Cuenta> cuentas, Scanner sc) {
        consultarCuentas(cuentas);
        System.out.println("Dame número de la cuenta que quieres ver sus movimientos: ");
        String numero = sc.nextLine();
        Cuenta cuenta = Busqueda.buscarCuenta(numero, cuentas);
        if (cuenta != null) {
            if (cuenta instanceof CuentaCorriente) {
                System.out.println("Info de los movimientos: ");
                CuentaCorriente cuentaCorriente = (CuentaCorriente) cuenta;
                for (Movimiento m : cuentaCorriente.getMovimientos()) {
                    System.out.println("Cantidad de dinero del movimiento: " + m.getCantidad());
                }
            } else {
                System.out.println("Esa cuenta no es una cuenta corriente, por lo tanto no puede tener movimientos.");
            }
        } else {
            System.out.println("Esa cuenta no existe.");
        }
    }

    public static void consultarMovimientosEntreFechas(List<Cuenta> cuentas) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame número de la cuenta corriente que quieras: ");
        String numero = sc.nextLine();
        Cuenta cuenta = Busqueda.buscarCuenta(numero, cuentas);
        if (cuenta != null) {
            if (cuenta instanceof CuentaCorriente) {
                CuentaCorriente cuentaCorriente = (CuentaCorriente) cuenta;
                System.out.println("Dame primera fecha para comparar: (dia/mes/año)");
                LocalDate primeraFecha = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                System.out.println("Dame segunda fecha para comparar: (dia/mes/año)");
                LocalDate segundaFecha = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                for (Movimiento m : cuentaCorriente.getMovimientos()) {
                    if (m.getFecha().isAfter(primeraFecha) && m.getFecha().isBefore(segundaFecha)) {
                        System.out.println("Cantidad del movimiento: " + m.getCantidad() +
                                "\nFecha del movimiento: " + m.getFecha() +
                                "\nHora del movimiento: " + m.getHora());
                    }
                }
            } else {
                System.out.println("No es una cuenta corriente, así que no tiene movimientos.");
            }
        } else {
            System.out.println("Esta cuenta no existe.");
        }
    }
}