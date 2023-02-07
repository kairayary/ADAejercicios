import java.util.Scanner;

public class TiempoRecorrido {
    public static void main(String[] args) {

            Scanner scanner= new Scanner(System.in);
            System.out.println("Ingrese la distancia en kilómetros");
            double km = scanner.nextDouble();
          int v = 25;

          double t= km/v;
        System.out.println("El tiempo que tarda la persona en reorrer " + km + " km es " + t + "horas");
    }
}
