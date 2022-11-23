//	El dueño de un estacionamiento requiere un diagrama de flujo con el algoritmo que le permita
//determinar cuánto debe cobrar por el uso del estacionamiento a sus clientes. Las tarifas que se tienen son las siguientes:
//Las dos primeras horas a $5.00 c/u.
//Las siguientes tres a $4.00 c/u.
//Las cinco siguientes a $3.00 c/u.
//Después de diez horas el costo por cada una es de dos pesos.

import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de horas que ha usado el estacionammiento ");
        int horas = scanner.nextInt();
        int costo =0;
        if (horas<= 2){

             costo =horas * 5;

        } else if (horas<=5) {
            costo= ((horas-2)* 4) + 10;

        } else if (horas<=10) {

            costo=((horas - 5)*3) + 22;

        } else if (horas>10) {
            
            costo=((horas-10)*2)+37;

        }
        System.out.println("El costo por " + horas + " horas de uso del estacionamiento es de $" + costo );
    }
}
