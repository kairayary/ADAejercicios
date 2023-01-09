package Entidades;

public class Persona {
    protected  String nombre;
    protected String apellido;
    protected  String genero;

    public Persona(){

    }

    public Persona(String nombre, String apellido, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
    }

    public void Saludar(){
        System.out.println("Hola");
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
