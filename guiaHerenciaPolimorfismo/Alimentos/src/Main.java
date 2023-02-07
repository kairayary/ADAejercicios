import entidades.NoPerecedero;
import entidades.Perecedero;

public class Main {
    public static void main(String[] args) {

        NoPerecedero alimento = new NoPerecedero();
        alimento.TipoAlimento();

        System.out.println(alimento);

        Perecedero alimento1 = new Perecedero();
        alimento1.TipoAlimento();

        System.out.println(alimento1);
    }
}