import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Integer> ListaContacto= new ArrayList<>();

        System.out.println("Indique la cantidad de contactos a ingresar en la lista");
        int N = input.nextInt();

       for (int i=0; i<N; i++){
           System.out.println("Ingrese un número de contacto");

           int contactos = input.nextInt();
           ListaContacto.add(contactos);
       }

        for (Integer contacto: ListaContacto) {
            System.out.println(contacto);
        }
    }
}