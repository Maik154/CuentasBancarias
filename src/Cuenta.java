public class Cuenta {
    private String numero, sucursal;


    public Cuenta() {

    }
    public Cuenta(String numero, String sucursal){
        this.numero = numero;
        this.sucursal = sucursal;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero() {
        this.numero = numero;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal() {
        this.sucursal = sucursal;
    }

}
