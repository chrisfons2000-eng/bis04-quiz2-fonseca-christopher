package coopetica.modelo;


import coopetica.modelo.Cuenta;
import coopetica.modelo.CuentaAhorro;
import coopetica.modelo.CuentaCorriente;

public class DemoCuentas {

    public static void main(String[] args) {

        Cuenta a = new CuentaAhorro("001", "118450236", 350000, 0.045);
        Cuenta b = new CuentaCorriente("002", "118450236", 120000, 100000);

        System.out.println("Ahorro retira 400000:   " + a.retirar(400000));
        System.out.println("Corriente retira 200000: " + b.retirar(200000));

        System.out.println(a);
        System.out.println(b);

        Cuenta c = new CuentaAhorro("001", "999999999", 1000, 0.01);
        System.out.println("a.equals(c): " + a.equals(c));
        System.out.println("a.equals(b): " + a.equals(b));
    }
}