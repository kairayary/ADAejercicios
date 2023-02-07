package entidades;

import java.util.Scanner;

public abstract class Alimento {
    protected String nombre;
    protected String marca;
    protected String rangoPrecio;

    public Alimento(){

    }

    public Alimento(String nombre, String marca, String rangoPrecio) {
        this.nombre = nombre;
        this.marca = marca;
        this.rangoPrecio = rangoPrecio;
    }

    public void TipoAlimento(){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("¿Cúal es el nombre del alimento?");
        nombre= input.nextLine();
        Scanner input1 = new Scanner(System.in).useDelimiter("\n");
        System.out.println("¿Cúal es la marca del alimento?");
        marca= input1.nextLine();
        Scanner input2 = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Indique si su rango de precio es: bajo, medio o alto");
        rangoPrecio= input2.nextLine();
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", rangoPrecio='" + rangoPrecio + '\'' +
                '}';
    }
}
