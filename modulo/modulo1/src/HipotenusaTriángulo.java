import java.util.Scanner;

public class HipotenusaTriángulo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese el valor del cateto adyacente");

        double ca = scanner.nextDouble();

        System.out.println("Ingrese el valor del cateto opuesto");

        double co = scanner.nextDouble();
        double h =  Math.sqrt(Math.pow(ca, 2) + Math.pow(co, 2));

        System.out.println("La hipotenusa del triángulo es " + h);
    }
}
