package coopetica.modelo;

public class Cuenta {

    private String numero;
    private String cedulaAsociado;
    private double saldo;

    public Cuenta(String numero, String cedulaAsociado, double saldo) {
        this.numero = numero;
        this.cedulaAsociado = cedulaAsociado;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public String getCedulaAsociado() {
        return cedulaAsociado;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
        }
    }

    public boolean retirar(double monto) {
        if (monto <= 0 || monto > this.saldo) {
            return false;
        }
        this.saldo -= monto;
        return true;
    }

    public String getTipo() {
        return "Cuenta";
    }

    @Override
    public String toString() {
        return getTipo() + " " + numero + " - asociado " + cedulaAsociado
                + " - saldo " + saldo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cuenta) {
            Cuenta otra = (Cuenta) obj;
            return this.numero.equals(otra.numero);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return numero.hashCode();
    }
}