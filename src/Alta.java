import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
            System.out.println("Dame fecha de vencimiento: (dia/mes/año");
            LocalDate fechaVencimiento = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.println("Dame DNI del cliente dueño de la cuenta: ");
            String dni = sc.nextLine();
            Cliente cliente = Busqueda.buscarCliente(dni, clientes);
            if (cliente != null) {
                CuentaPlazo cuentaPlazo = new CuentaPlazo(numero, sucursal, intereses, depositoPlazo, fechaVencimiento);
                cuentaPlazo.addCliente(cliente);
                cuentas.add(cuentaPlazo);
            } else {
                System.out.println("El cliente que estás intentando añadir a esta cuenta no existe.");
            }
        }
    }

    public static void añadirCuentaCorriente(List<Cuenta> cuentas, List<Cliente> clientes) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame número de cuenta: ");
        String numero = sc.nextLine();
        if (Busqueda.buscarCuenta(numero, cuentas) == null) {
            System.out.println("Dame sucursal de cuenta: ");
            String sucursal = sc.nextLine();
            System.out.println("Dame saldo actual de la cuenta");
            Double saldoActual = Double.parseDouble(sc.nextLine());
            System.out.println("Dame DNI del cliente dueño de la cuenta: ");
            String dni = sc.nextLine();
            Cliente cliente = Busqueda.buscarCliente(dni, clientes);
            if (cliente != null) {
                CuentaCorriente cuentaCorriente = new CuentaCorriente(numero, sucursal, saldoActual);
                cuentaCorriente.addCliente(cliente);
                cuentas.add(cuentaCorriente);
                cliente.addCuenta(cuentaCorriente);
            } else {
                System.out.println("El cliente que estás intentando añadir a esta cuenta no existe.");
            }
        }
    }

    public static void añadirMovimiento(List<Cuenta> cuentas) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame número de cuenta: ");
        String numero = sc.nextLine();
        Cuenta cuenta = Busqueda.buscarCuenta(numero, cuentas);
        if (cuenta != null) {
            if (cuenta instanceof CuentaCorriente) {
                CuentaCorriente cuentaCorriente = (CuentaCorriente) cuenta;
                switch (Menu.menuMovimiento()) {
                    case 1:
                        System.out.println("Dame cantidad de dinero que quieres ingresar: ");
                        float ingreso = Integer.parseInt(sc.nextLine());
                        cuentaCorriente.setSaldoActual(cuentaCorriente.getSaldoActual() + ingreso);
                        cuentaCorriente.addMovimiento(new Movimiento(numero, ingreso, cuentaCorriente.getSaldoActual()));
                        break;
                    case 2:
                        System.out.println("Dame cantidad de dinero que quieres retirar: ");
                        float retiro = Integer.parseInt(sc.nextLine());
                        if (retiro < ((CuentaCorriente) cuenta).getSaldoActual()) {
                            cuentaCorriente.setSaldoActual(cuentaCorriente.getSaldoActual() - retiro);
                            cuentaCorriente.addMovimiento(new Movimiento(numero, retiro, cuentaCorriente.getSaldoActual()));
                        } else {
                            System.out.println("El dinero que quieres retirar es mayor al disponible.");
                        }
                        break;
                    case 3:

                        break;
                    default:
                        System.out.println("Opción no existente.");
                }
            } else {
                System.out.println("La cuenta a la que quieres acceder es una cuenta a plazo y no se pueden añadir movimientos.");
            }
        }else{
            System.out.println("Esta cuenta no existe.");
        }
    }
}
