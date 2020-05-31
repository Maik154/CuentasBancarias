import java.util.Collection;
import java.util.List;

public class Busqueda {
    public static Cliente buscarCliente(String dni, Collection<Cliente> clientes) {
        for (Cliente c : clientes) {
            if (c.getDni().compareToIgnoreCase(dni) == 0) {
                return c;
            }
        }
        return null;
    }

    public static Cuenta buscarCuenta(String numero, List<Cuenta> cuentas) {
        for (Cuenta c : cuentas) {
            if (c.getNumero().compareToIgnoreCase(numero) == 0) {
                return c;
            }
        }
        return null;
    }
}
