import CuentaBancaria.CuentaBancaria;

public class Main {
    public static void main(String[] args) {

        CuentaBancaria transaccion = new CuentaBancaria();

        transaccion.crearCuenta();
        transaccion.ingresarDinero(300);
        transaccion.consultarSaldo();
        transaccion.retirarDinero(100);
        transaccion.consultarSaldo();
        transaccion.extraccionRapida(80);
        transaccion.consultarSaldo();

        System.out.println(transaccion);
    }
}