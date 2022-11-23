
//Realice un algoritmo que permita determinar el sueldo semanal de un trabajador con base
// en las horas trabajadas y el pago por hora, considerando que a partir de la
// hora número 41 y hasta la 45, cada hora se le paga el doble, de la hora 46 a la 50, el triple,
// y que trabajar más de 50 horas no está permitido. Represente el algoritmo mediante el
// diagrama de flujo y el pseudocódigo.

import java.util.Scanner;

public class SueldoS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de horas trabajadas");
        double horas= scanner.nextDouble();

        System.out.println("Digite el precio de la hora");
        double precio= scanner.nextDouble();

        double sueldoSemanal = 0;

        if (horas<=40){
            sueldoSemanal = precio* horas;
        }else if(horas>40 && horas<= 45){
                double extras = horas - 40;
                sueldoSemanal = (precio * 40) + (extras * precio *2);
        }else if(horas>45 && horas<= 50){
            double extras = horas - 45;
            sueldoSemanal = (precio * 40) + (extras * precio *3);
        }else
            System.out.println("No está permitido trabajar más de 50 ohras a la semana");

        System.out.println("El sueldo semanal por " + horas + " horas trabajadas es " + sueldoSemanal);
    }
}