
public class Main {
    public static void main(String[] args) {

       Alumno alumno = new Alumno("Kaira", "Abreu", 40,2008);
       alumno.Accion();
       alumno.mostrarDatos();

       Profesor profesor1 = new Profesor("Juan","Castro",65, "Cálculo");
       profesor1.Accion();
       profesor1.mostrarDatos();

    }
}