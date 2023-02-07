import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese el valor de la base");
        int b = scanner.nextInt();
        System.out.println("Ingrese el valor de la altura");
        int h = scanner.nextInt();

        int a = b*h/2;

        System.out.println("El área del triángulo es " + a);
    }

}
