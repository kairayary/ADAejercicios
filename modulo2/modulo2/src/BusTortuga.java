package modulo2.src;
//Represente un algoritmo mediante un diagrama de flujo y el pseudocódigo para determinar a qué
// lugar podrá ir de vacaciones una persona, considerando que la línea de autobuses “La tortuga” cobra
// por kilómetro recorrido. Se debe considerar el costo del pasaje tanto de ida, como de vuelta;
// los datos que se conocen y que son fijos son: México, 750 km; P.V., 800 km; Acapulco, 1200 km,
// y Cancún, 1800 km. También se debe considerar la posibilidad de tener que quedarse en casa.

import java.util.Scanner;

public class BusTortuga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el costo por kilómetro");
        int km = scanner.nextInt();

        System.out.println("Diga cual es su presupuesto");
        int presupuesto = scanner.nextInt();

        if((km*750*2)==presupuesto){
            System.out.println("Puede viajar a México");
        }else{
            System.out.println("Quedese en casa");
        }
        if((km*800*2)==presupuesto){
            System.out.println("Acapulco es su ruta");
        }
        if((km*1200*2)==presupuesto){
            System.out.println("Puerto Vallarta es su opción");
        }
        if((km*1800*2)==presupuesto){
            System.out.println("Cancún su destino");
        }
    }
}
