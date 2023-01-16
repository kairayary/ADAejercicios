
public class Profesor extends Persona{
    protected String materia;

    public Profesor(String materia) {
        this.materia = materia;
    }

    public Profesor(String nombre, String apellido, int edad, String materia) {
        super(nombre, apellido, edad);
        this.materia = materia;
    }

    @Override
    public void Accion() {
        System.out.println("Doy clases");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Mi nombre es " + nombre + apellido + " tengo: " + edad +
                " años y dicto la materia  " + materia);
    }
}
