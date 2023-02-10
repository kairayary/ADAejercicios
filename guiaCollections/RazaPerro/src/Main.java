import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String fin ="";
        boolean encontrado = false;
        List<String>ListaRazaPerro = new ArrayList<>();

        do {
            System.out.println("Ingrese una raza de perro");

            String raza = input.next();

            System.out.println("¿Desea continuar ingresando otra raza? - Presione S para continuar; " +
                     "de lo contrario presione cualquier tecla para salir");

            ListaRazaPerro.add(raza);

            fin = input.next();

        }while (fin.equalsIgnoreCase("s"));

        System.out.println("La lista de razas de perros ingresada es la siguiente: ");
        System.out.println(ListaRazaPerro);

        // Segunda parte. Buscar una raza y eliminarla o indicar que no se encontro

        System.out.println("+++++++++++++++");

        System.out.println("Ingrese la raza que desea eliminar ");
        String eliminar = input.next();

        Iterator<String> recorrido = ListaRazaPerro.iterator();

        while (recorrido.hasNext()){
            String elemento = recorrido.next();

            if (elemento.equals(eliminar)){
                recorrido.remove();
                boolean encotrado = true;
            }
        }

        if(!encontrado){
            System.out.println("La raza de perro ingresada no se encuentra en la lista");

        }
        System.out.println("Lista de raza de perros actualizada");

        for (String raza: ListaRazaPerro) {

            System.out.println(raza);

        }

    }
}