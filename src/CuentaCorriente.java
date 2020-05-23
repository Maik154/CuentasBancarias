public class CuentaCorriente extends Cuenta {
    private double SaldoActual;
    private String numero, sucursal;

    public CuentaCorriente() {

    }

    public CuentaCorriente(double SaldoActual, String numero, String sucursal) {
        this.SaldoActual = SaldoActual;
        this.numero = numero;
        this.sucursal = sucursal;
    }

    public Double getSaldoActual() {
        return SaldoActual;
    }

    public void setSaldoActual() {
        this.SaldoActual = SaldoActual;
    }
}
