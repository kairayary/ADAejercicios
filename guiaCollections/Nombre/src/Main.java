import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        List<String> ListaNombres = new ArrayList<>();

        System.out.println("Indique la cantidad de nombres a ingresar");

        int N = input.nextInt();

        for (int i= 0; i<N; i++){
            System.out.println("Ingrese un nombre");
            String nombre = input.next();

            ListaNombres.add(nombre);
        }

         Collections.sort(ListaNombres);

         for (int i=0; i<ListaNombres.size(); i++){

             String nombres = ListaNombres.get(i);

             System.out.println(nombres);

         }


         ListaNombres.remove(2);
         ListaNombres.remove(0);

         System.out.println("--Lista una vez eliminados el número 3 y 1");

         for ( String nombres:ListaNombres) {

            System.out.println(nombres);
        }
    }
}