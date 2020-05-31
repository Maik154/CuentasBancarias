import java.util.HashSet;
import java.util.Set;

public abstract class Cuenta {
    private String numero;
    private String sucursal;
    private Set<Cliente> clientesCuenta;

    public Cuenta(String numero, String sucursal) {
        this.numero = numero;
        this.sucursal = sucursal;
        clientesCuenta = new HashSet<>();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public Set<Cliente> getClientesCuenta() {
        return clientesCuenta;
    }

    public void setClientesCuenta(Set<Cliente> clientesCuenta) {
        this.clientesCuenta = clientesCuenta;
    }

    public void addCliente(Cliente cliente) {
        clientesCuenta.add(cliente);
    }
}
