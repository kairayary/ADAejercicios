import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de kilowatts consumidos");
        double kw = scanner.nextDouble();
        int precioKw = 25;

        double total= kw * precioKw;
        System.out.println("El pago a realizar por  " + kw + " kw consumidos son $" + total );
    }
}
