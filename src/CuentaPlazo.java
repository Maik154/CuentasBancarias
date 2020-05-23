import java.util.Set;

public class CuentaPlazo extends Cuenta {
    private float intereses;
    private long depositoPlazo;


    public CuentaPlazo(String numero, String sucursal, float intereses, long depositoPlazo) {
        super(numero, sucursal);
        this.intereses = intereses;
        this.depositoPlazo = depositoPlazo;
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
