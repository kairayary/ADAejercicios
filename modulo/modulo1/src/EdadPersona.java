import java.util.Scanner;

public class EdadPersona {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Diga el año en que nació");
        int año = scanner.nextInt();

        int añoActual = 2022;
        int edad = añoActual - año;

        System.out.println("La edad del candidato es " + edad + " años");

    }
}
