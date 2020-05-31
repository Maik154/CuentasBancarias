import java.time.LocalDate;
import java.time.LocalTime;

public class Movimiento {
    private String numeroCta;
    private float cantidad;
    private double saldoActual;
    private LocalDate fecha;
    private LocalTime hora;

    public Movimiento(String numeroCta, float cantidad, double saldoActual) {
        this.numeroCta = numeroCta;
        this.cantidad = cantidad;
        this.saldoActual = saldoActual;
        fecha = LocalDate.now();
        hora = LocalTime.now();
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

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

}
