package modulo2.src;
//Se les dará un bono por antigüedad a los empleados de una tienda. Si tienen un año,
// se les dará $100; si tienen 2 años, $200, y así sucesivamente hasta los 5 años.
// Para los que tengan más de 5, el bono será de $1000. Realice un algoritmo y
// represéntelo mediante el diagrama de flujo y el pseudocódigo que permita determinar
// el bono que recibirá un trabajador.

import java.util.Scanner;

public class BonoTienda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de años trabajando para la tienda");

        int antiguedad = scanner.nextInt();

        switch (antiguedad){
            case 1:
                System.out.println("Su bono es de:$100");
                break;
            case 2:
                System.out.println("Su bono es de:$200");
                break;
            case 3:
                System.out.println("Su bono es de:$300");
                break;
            case 4:
                System.out.println("Su bono es de:$400");
                break;
            case 5:
                System.out.println("Su bono es de:$500");
                break;
            default:

                System.out.println("Su bono es de:$1000");
        }
    }
}
