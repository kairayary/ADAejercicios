//El 14 de febrero una persona desea comprarle un regalo al ser querido que más aprecia en ese momento, su dilema radica en qué regalo puede hacerle, las alternativas que tiene son las siguientes:

//REGALO	COSTO
//Tarjeta	$10.00 o menos
//Chocolates	$11.00 a $100.00
//Flores	$101.00 a $250.00
//Anillo	Más de $251.00

// ayude a determinar qué regalo se le puede comprar a ese ser tan especial por el día del amor y la amistad

import java.util.Scanner;

public class Enamorado {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué cantidad de dinero va a gastar en regalo?");
        int cantidad = scanner.nextInt();

        if(cantidad<=10){
            System.out.println("Puede comprar una tarjeta");
        }else if (cantidad> 10 && cantidad <=100) {
               System.out.println("Puede regalar chocolates");
           }else if(cantidad> 100 && cantidad <=250){
                   System.out.println("Tiene la posibilidad de regalar flores");
               }else if (cantidad> 250){
            System.out.println("Tiene la posibilidad de regalar un anillo");
           }
        }
    }
