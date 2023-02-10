package entidades;


import java.util.ArrayList;

public class AlumnoLogica {
    private ArrayList<Alumno> listaALumno;

    public AlumnoLogica(){
        this.listaALumno= new ArrayList<>();

    }

    public AlumnoLogica(ArrayList<Alumno> listaALumno) {
        this.listaALumno = listaALumno;
    }

    //metodo
    public void CrearAlumno(String nombre, Integer nota1, Integer nota2, Integer nota3){
        Alumno alumno = new Alumno(); // instancia de la clase
        ArrayList<Integer>notas = new ArrayList<>();// array donde se aloja las notas
        alumno.setNombre(nombre);//pasar nombre
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);

        alumno.setNotas(notas);//pasar notas
        agregarAlumno(alumno);
    }
    public void agregarAlumno(Alumno alumno){ //metodo que recibe por parametro el objeto alumno
        this.listaALumno.add(alumno);

    }
    public void mostrarLista(){
        for (Alumno alumno: listaALumno) {
            System.out.println(alumno.toString());
        }
    }
}
