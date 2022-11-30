package Entidades;

public class Vehiculo {
     public String marca;
     public int maxVelocidad;
     public String color;

     public void moveOn(){
         System.out.println("Moviendo hacia adelante");
     }

     public  void brake(){
         System.out.println("Estoy frenando");
     }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", maxVelocidad=" + maxVelocidad +
                ", color='" + color + '\'' +
                '}';
    }
}
