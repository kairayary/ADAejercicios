public abstract class  Animales {
 protected String animal;
 protected boolean peligroso;
 protected int edad;

    public Animales(String animal, boolean peligroso, int edad) {
        this.animal = animal;
        this.peligroso = peligroso;
        this.edad = edad;
    }

    public abstract void tipoAnimal();



 public abstract void Alimentacion();


}
