import java.util.Set;

public class CuentaCorriente extends Cuenta {
    private double saldoActual;
    private Set<Movimiento> movimientos;

    public CuentaCorriente(String numero, String sucursal, double saldoActual, Set<Movimiento> movimientos) {
        super(numero, sucursal);
        this.saldoActual = saldoActual;
        this.movimientos = movimientos;
    }

    public Double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public Set<Movimiento> getMovimientos(){
        return movimientos;
    }

    public void setMovimientos(Set<Movimiento> movimientos){
        this.movimientos = movimientos;
    }
}
