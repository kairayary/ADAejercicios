public class Alumno extends Persona{
    protected int añoAcademico;


    public Alumno(int añoAcademico) {
        this.añoAcademico = añoAcademico;
    }

    public Alumno(String nombre, String apellido, int edad, int añoAcademico) {
        super(nombre, apellido, edad);
        this.añoAcademico = añoAcademico;
    }

    @Override
    public void Accion() {
        System.out.println("Estoy aprendiendo");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Mi nombre es " + nombre + " " + apellido + " tengo: " + edad +
                " años y estoy en el año academico " + añoAcademico);
    }


}
