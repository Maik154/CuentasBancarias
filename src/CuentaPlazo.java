public class CuentaPlazo extends Cuenta {
    private float intereses;
    private long depositoPlazo;

    public CuentaPlazo() {

    }

    public CuentaPlazo(Float intereses, long depositoPlazo) {
        this.intereses = intereses;
        this.depositoPlazo = depositoPlazo;
    }

    public Float getIntereses() {
        return intereses;
    }

    public void setIntereses() {
        this.intereses = intereses;
    }

    public Long getDepositoPlazo() {
        return depositoPlazo;
    }

    public void setDepositoPlazo() {
        this.depositoPlazo = depositoPlazo;
    }
}
