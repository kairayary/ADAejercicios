import java.util.Scanner;

public class LLamadaTlf {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese el tiempo de duración de la llamada en minutos");
        int t = scanner.nextInt();
        int precioMin = 25;

        int total = t * precioMin;
        System.out.println("El costo por " + t + " minutos es $" + total);
    }
}
