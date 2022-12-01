package Entidades;

import java.util.Scanner;

public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double CalcularArea(){
        Scanner fig = new Scanner(System.in);

        System.out.println("Ingrese el valor de la base");
        base = fig.nextDouble();

        System.out.println("Ingrese el valor de la altura");
        altura= fig.nextDouble();

        double area = base * altura;
        System.out.println("El área del triángulo es " + area);
        return area;
    }

    public void CrearRectangulo(){
        System.out.println("El valor de la altura es " + altura);
        System.out.println("La base es " +  base);

    }
}
