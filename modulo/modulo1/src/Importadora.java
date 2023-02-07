import java.util.Scanner;

public class Importadora {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        System.out.println("Ingrese la cantidad de dinero mexicano");
        double pesos = scanner.nextInt();
        double dlr = pesos * 0.051;
        System.out.println("Con la cantidad de dinero que tiene puede adquirir " + dlr + " dólares");
    }
}
