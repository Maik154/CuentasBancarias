import java.util.List;
import java.util.Scanner;

public class Busqueda {
    public static void buscarCuentaPorNumero(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Dame número de la cuenta que quieres buscar: ");
        //recordarme cómo se hace la búsqueda con un String y lo del compareToIgnoreCase
        //D:\Miguel\Maikel\Clases Jesús\Cuarta y quinta clases
        //D:\Miguel\Maikel\Clases Jesús
    }

    public static Cliente buscarCliente(String dni, List<Cliente> clientes) {
        for (Cliente c : clientes) {
            if (c.getDni().compareToIgnoreCase(dni) == 0) {
                System.out.println("Este dni ya existe.");
                return c;
            }
        }
        return null;
    }

    public static Cuenta buscarCuenta(String numero, List<Cuenta> cuentas) {
        for (Cuenta c : cuentas) {
            if (c.getNumero().compareToIgnoreCase(numero) == 0) {
                System.out.println("Esta cuenta ya existe.");
                return c;
            }
        }
        return null;
    }
}
