package entidades;

public class Perecedero extends Alimento{

    public Perecedero() {
    }

    public Perecedero(String nombre, String marca, String rangoPrecio) {

        super(nombre, marca, rangoPrecio);
    }

    @Override
    public void TipoAlimento(){
        super.TipoAlimento();
    }

    @Override
    public String toString() {
        return "Alimento: " + nombre + " marca " + marca +
                " rango de precio " + rangoPrecio +
                " es un alimento perecedero " + '\n' + super.toString();
    }
}
