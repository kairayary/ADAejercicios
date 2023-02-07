import java.util.Scanner;

public class Conagua {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de metros cúbicos de agua");
        double m3 = scanner.nextDouble();
        int precioM3 = 25;

        double total= m3 * precioM3;
        System.out.println("El pago a realizar por  " + m3 + " metros cúbicos son $" + total );
    }
}
