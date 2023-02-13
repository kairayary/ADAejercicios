package entidades;

import java.util.Scanner;

public class Menu {

    Scanner input = new Scanner(System.in).useDelimiter("\n");
    Serie serie = new Serie();
    boolean salir = false;
   String terminar = "";
   int opcion;
    public void menu() {

        do {
            System.out.println(
                    "Seleccione una opción para continuar: " + "\n" +
                            "- 1. Agregar una Serie." + "\n" +
                            "- 2. Mostrar la lista completa de todas las series ingresadas." + "\n" +
                            "- 3. Mostrar la lista de todas las series menores de 15 minutos. " + "\n" +
                            "- 4. Mostrar la lista de todas las series mayores a 40 minutos." + "\n" +
                            "- 5. Mostrar la lista de todas las series de categoría “ROMANCE.”" + "\n" +
                            "- 6. Mostrar la lista de todas las series de categoría “DRAMA.”" + "\n" +
                            "- 7. Mostrar la lista de todas las series de categoría “COMEDIA.”" + "\n" +
                            "- 8. Salir.");

            opcion= input.nextInt();

           switch (opcion){

               case 1:
                   System.out.println("Añadir una serie a la lista");
                   serie.CrearSerie();

                   System.out.println("La serie fue guaradada exitosamente. Para regresar al menú presione la letra S," +
                           " de lo contrario presione cualquier tecla");
                    terminar = input.next();
                   break;
               case 2:
                   System.out.println("---Lista de Series---");
                   serie.verLista();

                   System.out.println(" Para regresar al menú presione la letra S," +
                           " de lo contrario presione cualquier tecla");
                   terminar = input.next();
                   break;
               case 3:
                   System.out.println("---Lista de Series menores a 15 minutos---");
                   serie.menor15();

                   System.out.println(" Para regresar al menú presione la letra S," +
                           " de lo contrario presione cualquier tecla");
                   terminar = input.next();
                   break;
               case 4:
                   System.out.println("---Lista de Series mayores a 40 minutos---");
                   serie.mayor40();

                   System.out.println(" Para regresar al menú presione la letra S," +
                           " de lo contrario presione cualquier tecla");
                   terminar = input.next();
                   break;
               case 5:
                   System.out.println("---Lista de Series categoria ROMANCE---");
                  serie.categoriaRomance();

                   System.out.println(" Para regresar al menú presione la letra S," +
                           " de lo contrario presione cualquier tecla");
                   terminar = input.next();
                   break;
               case 6:
                   System.out.println("---Lista de Series categoria DRAMA---");
                   serie.categoriaDrama();

                   System.out.println(" Para regresar al menú presione la letra S," +
                           " de lo contrario presione cualquier tecla");
                   terminar = input.next();
                   break;
               case 7:
                   System.out.println("---Lista de Series categoria COMEDIA---");
                   serie.categoriaComedia();

                   System.out.println(" Para regresar al menú presione la letra S," +
                           " de lo contrario presione cualquier tecla");
                   terminar = input.next();
                   break;


               case 8:
                   System.out.println("Ha finalizado");

           }

        }while (terminar.equalsIgnoreCase("S"));


    }
}
