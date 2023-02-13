package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaLogica {

    private ArrayList<Pelicula> ListaPeliculas;

    public PeliculaLogica() {
        this.ListaPeliculas = new ArrayList<>();
    }

    public Pelicula crearPelicula(String titulo, String director, int duracion) {
        Pelicula pelicula = new Pelicula(titulo, director, duracion);
        return pelicula;
    }

    public ArrayList<Pelicula> sumarPelicula() {
        System.out.println("Ingrese una Pelicula");
        Scanner entrada = new Scanner(System.in);
        String finalizar = "";
        do {
            System.out.println("Dígite el titulo de la pelicula");
            String titulo = entrada.next();

            System.out.println("Indique el director de la pelicula");
            String director = entrada.next();

            System.out.println("Ingrese la(s) hora(s) de dureación de la pelicula");
            int duracion= entrada.nextInt();

            ListaPeliculas.add(crearPelicula(titulo, director, duracion));

            System.out.println("¿Desea cargae más peliculas?, presione S para continuar... "
            + "en caso contrario presione cualquier tecla");
            finalizar = entrada.next();
        } while (finalizar.equalsIgnoreCase("s"));

      return ListaPeliculas;
    }

    public void mostrarListaPeliculas(){
        for (Pelicula posicion: ListaPeliculas) {
            System.out.println(posicion);
        }
    }

    public void PeliculasMayores2Horas(){
        for (Pelicula posicion: ListaPeliculas) {

            if (posicion.getDuracion()>=2){
                System.out.println(posicion);
            }

        }
    }
    public void PeliculasMenores2Horas(){
        for (Pelicula posicion: ListaPeliculas) {

            if (posicion.getDuracion()<2){
                System.out.println(posicion);
            }

        }
    }
}
