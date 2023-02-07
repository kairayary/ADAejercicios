import java.util.Scanner;

public class AhorroPersona {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dinero semanal a ahorrar");
        int dinero = scanner.nextInt();
        double ahorroSemanal= dinero*0.15;
        double ahorroMensual= ahorroSemanal*4;
        double ahorrAnual= ahorroSemanal*12;


        System.out.println("El ahorro mensual de una persona que guarda el 15% de " + dinero + " semanalmente"
                + ahorroMensual + "el anual seria " + ahorrAnual);
    }
}
