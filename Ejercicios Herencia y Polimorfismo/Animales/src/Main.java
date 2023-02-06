public class Main {
    public static void main(String[] args) {


        Carnivoro carnivoro = new Carnivoro("leon",true,5);
        carnivoro.Alimentacion();
        carnivoro.tipoAnimal();

        Herbivoro herbivoro= new Herbivoro("tortuga", false, 12);
        herbivoro.Alimentacion();
        herbivoro.tipoAnimal();
    }
}