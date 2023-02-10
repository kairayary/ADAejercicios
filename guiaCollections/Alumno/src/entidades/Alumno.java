package entidades;

import java.util.ArrayList;


public class Alumno {
  //Atributos de la clase
     String nombre;
     private ArrayList<Integer> notas;

    //Constructores
    public Alumno() {
    }

    public Alumno(String nombre, ArrayList<Integer> notas, ArrayList<String> alumno) {
        this.nombre = nombre;
        this.notas = notas;

    }
     // set y getter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

     //sobreescritura
    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", notas=" + notas +
                '}';
    }
}
