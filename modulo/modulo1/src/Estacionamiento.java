import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int precioHora = 150;
        System.out.println("Dígite cantidad de horas a utilizar de estacionamiento");
        int hras = scanner.nextInt();

        int costo= hras * precioHora;

        System.out.println("El cobro por uso es de $" + costo );
    }

}
