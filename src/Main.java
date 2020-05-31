import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        List<Cliente> clientes = new ArrayList<>();
        List<Cuenta> cuentas = new ArrayList<>();
        do {
            op = Menu.menuPrincipal();
            switch (op) {
                case 1:
                    int opA = 0;
                    do {
                        opA = Menu.menuAñadir();
                        switch (opA) {
                            case 1:
                                Alta.añadirCliente(clientes);
                                break;
                            case 2:
                                Alta.añadirCuentaCorriente(cuentas, clientes);
                                break;
                            case 3:
                                Alta.añadirCuentaPlazo(cuentas, clientes);
                                break;
                            case 4:
                                Alta.añadirMovimiento(cuentas);
                                break;
                            case 5:

                                break;
                            default:
                                System.out.println("Opción inálida.");
                        }
                    } while (opA != 5);
                    break;
                case 2:
                    int opE = 0;
                    do {
                        opE = Menu.menuEliminar();
                        switch (opE) {
                            case 1:
                                Baja.eliminarCuenta(cuentas, sc, clientes);
                                break;
                            case 2:
                                Baja.eliminarClienteDeUnaCuenta(cuentas, sc);
                                break;
                            case 3:

                                break;
                            default:
                                System.out.println("Opción inválida.");
                        }
                    } while (opE != 3);
                    break;
                case 3:
                    Modificacion.cambiarDireccion(clientes, sc);
                    break;
                case 4:
                    int opC = 0;
                    do {
                        opC = Menu.menuConsulta();
                        switch (opC) {
                            case 1:
                                Consulta.consultarClientesDeUnaCuenta(cuentas);
                                break;
                            case 2:
                                Consulta.consultarCuentasDeUnCliente(clientes, cuentas);
                                break;
                            case 3:
                                Consulta.consultarMovimientos(cuentas, sc);
                                break;
                            case 4:

                                break;
                            default:
                                System.out.println("Opción inválida.");
                        }
                    } while (opC != 4);
                    break;
                case 5:
                    Consulta.consultarMovimientosEntreFechas(cuentas);
                    break;
                case 6:

                    break;
                default:
                    System.out.println("Opción no existente.");
            }
        } while (op != 6);
    }
}
