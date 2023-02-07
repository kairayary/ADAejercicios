import java.util.Scanner;

public class BrochaGorda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Diga la cantidad de metros cuadrados a pintar");
        double cantM = scanner.nextDouble();

        int precioM2= 750;

        double costo = cantM * precioM2;

        System.out.println("El costo por " + cantM + " m2 es de $" + costo);

    }
}
