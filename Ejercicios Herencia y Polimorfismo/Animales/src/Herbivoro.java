public class Herbivoro extends Animales{

    public Herbivoro(String animal, boolean peligroso, int edad) {
        super(animal, peligroso, edad);
    }
    @Override
    public  void Alimentacion(){
        System.out.println(" Se alimenta de plantas");
    }
    @Override
    public void tipoAnimal(){
        System.out.println( "El animal es " + animal + " es " + peligroso + " y tiene una edad de " + edad);
    }
}
