import Entidades.Cancion;
import Entidades.Vehiculo;

public class Main {
    public static void main(String[] args) {

       /* Vehiculo auto = new Vehiculo();
        auto.marca = "Audi";
        auto.maxVelocidad= 220;
        auto.color="negro";

        System.out.println(auto);

        auto.moveOn();
        auto.brake();*/


        Cancion melodia = new Cancion();
        melodia.setTitulo("Vivir");
        melodia.setAutor("Franco");
        melodia.EscribirCancion();
    }
}