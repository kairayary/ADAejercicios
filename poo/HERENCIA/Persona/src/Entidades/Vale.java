package Entidades;

public class Vale extends Persona {
    protected int edad;

    public Vale(String valeria, String abreu, String femenino){

    }

    public Vale(String nombre, String apellido, String genero, int edad) {
        super(nombre, apellido, genero);
        this.edad = edad;
    }

    @Override
    public void Saludar() {
        System.out.println("Adios me voy");
    }

    @Override
    public String toString() {
        return "Vale{" +
                "edad=" + edad +
                '}' + super.toString();
    }
}
