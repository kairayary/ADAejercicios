package CuentaBancaria;

import java.util.Scanner;

public class CuentaBancaria {
    private int numeroCuenta;
    private long dni;
    private double saldoActual;


    public CuentaBancaria() {

    }


    public CuentaBancaria(int numeroCuenta, long dni, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;

    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }





    public void crearCuenta(){
        System.out.println("Ingrese su DNI");
        Scanner teclado = new Scanner(System.in);
        dni = teclado.nextLong();

        System.out.println("Digite su número de cuenta");
        numeroCuenta= teclado.nextInt();

        System.out.println("Diga cual es su saldo");

        saldoActual = teclado.nextDouble();

    }

    public double ingresarDinero( double cantidad_ingresada){

      saldoActual += cantidad_ingresada;


        return  saldoActual;
    }

    public double  retirarDinero(double cantidad_retirada){
        ;
        if (this.saldoActual <= cantidad_retirada){
            saldoActual=0;
        }else{

            saldoActual-= cantidad_retirada;
        }

        return saldoActual;
    }

    public double extraccionRapida(double cantidad){
        if (cantidad != saldoActual*0.2){
            System.out.println("No puede realizar extracción rápida, el monto a estraer excede el 20% permitido");
        }else{
            saldoActual-=cantidad;
        }


        return saldoActual;
    }

    public void consultarSaldo(){
        System.out.println("Su saldo es " + saldoActual);

    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta=" + numeroCuenta +
                ", dni=" + dni +
                ", saldoActual=" + saldoActual +
                '}';
    }


}
