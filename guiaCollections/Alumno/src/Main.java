import entidades.AlumnoLogica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner informacion = new Scanner(System.in);
        AlumnoLogica listaAlumno = new AlumnoLogica();

        String nombre;
        String fin= "";
        Integer nota1;
        Integer nota2;
        Integer nota3;



        System.out.println("Para ingresar alumnos a la lista");

        do{
            System.out.println("Ingrese el nombre");
            nombre = informacion.next();
            System.out.println("Digite la nota uno");
            nota1= informacion.nextInt();
            System.out.println("Digite la nota dos");
            nota2= informacion.nextInt();
            System.out.println("Digite la nota tres");
            nota3= informacion.nextInt();

            System.out.println("Si desea continuar ingresando informacio de otro alumno presione S, " +
                    "de lo contrario presione otra tecla");
            fin= informacion.next();
            listaAlumno.CrearAlumno(nombre,nota1,nota2,nota3);


        }while (fin.equalsIgnoreCase("s"));

        System.out.println("---Lista de Alumnos---");
        listaAlumno.mostrarLista();
    }
}