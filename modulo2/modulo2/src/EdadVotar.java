//Realice un algoritmo para determinar si una persona puede votar con base a su edad


import java.util.Scanner;

public class EdadVotar {
    public static void main(String[] args) {

        System.out.println("Diga su edad");
        Scanner scanner = new Scanner(System.in);

        int edad = scanner.nextInt();
        if (edad >= 18) {
            System.out.println("Tienes edad para participar en las próximas elecciones");
        }else{
            System.out.println("No tienes edad suficente para participar en las próximas elecciones");
        }
    }
}