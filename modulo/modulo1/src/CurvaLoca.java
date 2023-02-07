import java.util.Scanner;

public class CurvaLoca {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese la distancia en kilómetros");
        double km = scanner.nextDouble();

        int precioKm = 200;
          double total = km * precioKm;
          System.out.println("El costo del boleto por " + km + " km es $" + total);
    }
}
