package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Serie {
    Scanner input = new Scanner(System.in);
    private String nombre;
    private String categoria;
    private int duracionMin;

    private ArrayList<Serie> listaSeries;

    public Serie() {
        this.listaSeries = new ArrayList<>();
    }

    public Serie(ArrayList<Serie> listaSeries) {
        this.listaSeries = listaSeries;
    }

    public ArrayList<Serie> getListaSeries() {
        return listaSeries;
    }

    public void setListaSeries(ArrayList<Serie> listaSeries) {
        this.listaSeries = listaSeries;
    }

    public Serie(String nombre, String categoria, int duracionMin) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.duracionMin = duracionMin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(int duracionMin) {
        this.duracionMin = duracionMin;
    }

    public void CrearSerie() {

        Serie serie = new Serie();

        System.out.println("Ingrese el nombre de la serie: ");
        String nombre = input.next();
        serie.setNombre(nombre);

        System.out.println("Ingrese la categoria de la serie: ");
        String categoria = input.next();
        serie.setCategoria(categoria);

        System.out.println("Ingrese la duracion de la serie, en minutos: ");
        int duracion = input.nextInt();
        serie.setDuracionMin(duracion);

        añadirSerie(serie);
    }

    public void añadirSerie(Serie serie) {
        this.listaSeries.add(serie);
    }

    public void verLista() {
        System.out.println("\n" + " Lista completa de series: ");
        for (Serie lista : listaSeries) {
            System.out.println(lista);
        }
    }

    public void menor15() {
        System.out.println("\n" + " Lista completa de series menores o igual a una duración 15 minutos: ");
        for (Serie programa : listaSeries) {
            if (programa.getDuracionMin() <= 15) {
                System.out.println(programa);
            }
        }
    }

    public void mayor40() {
        System.out.println("\n" + " Lista completa de series mayores o igual a una duración de 40 minutos: ");
        for (Serie programa : listaSeries) {
            if (programa.getDuracionMin() >= 40) {
                System.out.println(programa);
            }
        }
    }

    public void categoriaRomance() {
        System.out.println("\n" +  "Lista completa de series Categoria ROMANCE : ");
        for (Serie programa : listaSeries) {
            if (programa.getCategoria().equalsIgnoreCase("Romance")) {
                System.out.println(programa);
            }
        }
    }

    public void categoriaComedia() {
        System.out.println("\n" + "Lista completa de series Categoria COMEDIA : ");
        for (Serie programa : listaSeries) {
            if (programa.getCategoria().equalsIgnoreCase("Comedia")) {
                System.out.println(programa);
            }
        }
    }

    public void categoriaDrama() {
        System.out.println("\n" + " Lista completa de series Categoria DRAMA : ");
        for (Serie programa: listaSeries) {
            if (programa.getCategoria().equalsIgnoreCase("Drama")) {
                System.out.println(programa);
            }

        }
    }

    public void categoriaSuspenso() {
        System.out.println("\n" + " Lista completa de series Categoria SUSPENSO : ");
        for (Serie programa : listaSeries) {
            if (programa.getCategoria().equalsIgnoreCase("Suspenso")) {
                System.out.println(programa);
            }
        }
    }

    @Override
    public String toString() {
        return
                "nombre =" + nombre + "\n" +
                ", categoria =" + categoria + "\n" +
                ", duracionMin =" + duracionMin + "\n" +
                ", listaSeries =" + listaSeries ;
    }
}