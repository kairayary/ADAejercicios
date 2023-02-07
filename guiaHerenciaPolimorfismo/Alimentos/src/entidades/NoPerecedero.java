package entidades;

public class NoPerecedero extends Alimento{

    protected boolean fechaVencimiento;

    public NoPerecedero(boolean fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public NoPerecedero(String nombre, String marca, String rangoPrecio, boolean fechaVencimiento) {
        super(nombre, marca, rangoPrecio);
        this.fechaVencimiento = fechaVencimiento;
    }

    public NoPerecedero() {
        super();
    }

    public NoPerecedero(String nombre, String marca, String rangoPrecio) {
        super(nombre, marca, rangoPrecio);
    }

    @Override
    public void TipoAlimento() {
        super.TipoAlimento();
    }

    @Override
    public String toString() {
        return "Alimento :" + " nombre: " + nombre + " marca " + marca +
                " rango de precio " + rangoPrecio +
                " es un alimento NO precedero " +
                '\n' + super.toString();
    }
}
