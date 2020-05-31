import java.time.LocalDate;

public class CuentaPlazo extends Cuenta {
    private float intereses;
    private long depositoPlazo;
    private LocalDate fechaVencimiento;

    public CuentaPlazo(String numero, String sucursal, float intereses, long depositoPlazo, LocalDate fechaVencimiento) {
        super(numero, sucursal);
        this.intereses = intereses;
        this.depositoPlazo = depositoPlazo;
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Float getIntereses() {
        return intereses;
    }

    public void setIntereses(float intereses) {
        this.intereses = intereses;
    }

    public Long getDepositoPlazo() {
        return depositoPlazo;
    }

    public void setDepositoPlazo(long depositoPlazo) {
        this.depositoPlazo = depositoPlazo;
    }
}
