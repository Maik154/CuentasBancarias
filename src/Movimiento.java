public class Movimiento {
    private String numeroCta;
    private float cantidad;
    private double saldoActual;

    public Movimiento(String numeroCta, Float cantidad, Double saldoActual) {
        this.numeroCta = numeroCta;
        this.cantidad = cantidad;
        this.saldoActual = saldoActual;
    }

    public String getNumeroCta() {
        return numeroCta;
    }

    public void setNumeroCta(String numeroCta) {
        this.numeroCta = numeroCta;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
}
