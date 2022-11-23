//Realice un algoritmo para determinar el sueldo semanal de un trabajador con base en las horas trabajadas
//y el pago por hora, considerando que después de las 40 horas cada hora se considera como excedente y se paga el doble.

import java.util.Scanner;

public class SueldoSemanal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de horas trabajadas");
         double horas= scanner.nextDouble();

        System.out.println("Digite el precio de la hora");
        double precio= scanner.nextDouble();

        double sueldoSemanal = 0;

        if (horas<=40){
            sueldoSemanal = precio* horas;
        }else{
            if(horas>=40){
                double extras = horas - 40;
                 sueldoSemanal = (precio * 40) + (extras * precio *2);
            }

        }
        System.out.println("El sueldo semanal por " + horas + " horas trabajadas es " + sueldoSemanal);
    }
}

