package modulo2.src;

import java.util.Scanner;

//Cierta empresa proporciona un bono mensual a sus trabajadores, el cual puede ser por su antigüedad o bien
// por el monto de su sueldo (el que sea mayor), de la siguiente forma:
//Cuando la antigüedad es mayor a 2 años pero menor a 5, se otorga 20 % de su sueldo;
//cuando es de 5 años o más, 30 %. Ahora bien, el bono por concepto de sueldo,
//si éste es menor a $1000, se da 25 % de éste, cuando éste es mayor a $1000, pero menor o igual a $3500,
//se otorga 15% de su sueldo, para más de $3500. 10%. Realice el algoritmo correspondiente para calcular los
//dos tipos de bono, asignando el mayor y represéntelo con un diagrama de flujo y pseudocódigo.

import java.util.Scanner;
public class BonoMensual {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su sueldo");
        int sueldo = scanner.nextInt();
        System.out.println("Ingrese su antiguedad");
        int antiguedad = scanner.nextInt();
        double bono1 =0;
        double bono2= 0;

        if(antiguedad>2 && antiguedad<5){
            bono1= sueldo * 0.20;
        }else if (antiguedad>=5) {
           bono1= sueldo*0.30;
        }

        if(sueldo<1000){
            bono2= sueldo*0.25;
        }else if(sueldo>=1000 && sueldo<= 3500){
           bono2=sueldo* 0.15;
        }else{
            bono2= sueldo * 0.10;

        }
        System.out.println("Tu sueldo es $" + sueldo);
        System.out.println("El bono por antiguedad es $" + bono1);
        System.out.println("El bono por sueldo es $" + bono2);

        if (bono1>bono2){
            System.out.println("El bono a recibir será $" + bono1);
        }else{
            System.out.println("El bono a reibir será $" + bono2);
        }
    }
}
