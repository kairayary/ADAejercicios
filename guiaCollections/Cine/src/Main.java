import entidades.PeliculaLogica;

public class Main {
    public static void main(String[] args) {

        PeliculaLogica cargaPelicula= new PeliculaLogica();

        cargaPelicula.sumarPelicula();
        System.out.println("----Peliculas cargadas---");
        cargaPelicula.mostrarListaPeliculas();

        System.out.println("--Peliculas que duran de 2 a más horas---");
        cargaPelicula.PeliculasMayores2Horas();

        System.out.println("--Peliculas que duran menos de 2 horas--");
        cargaPelicula.PeliculasMenores2Horas();

    }
}