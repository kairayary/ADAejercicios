package Entidades;

public class ImpLibro implements Libro {
    @Override
    public void titulo() {
        System.out.println("La Rebelión de Lucifer");
    }

    @Override
    public void cantPaginas() {
        System.out.println("Cantidad de páginas es 340");
    }

    @Override
    public void autor() {
        System.out.println("Autor: J.J Benitez");
    }
}
