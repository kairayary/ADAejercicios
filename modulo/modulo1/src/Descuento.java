import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese el precio del articulo a comprar");
        double precio = scanner.nextDouble();
        double precioDescuento = precio - (precio * 0.20);
        double precioTotal = precioDescuento * 1.15;

        System.out.println("El precio con descuento es $" + precioDescuento + "  el total a pagar es $" + precioTotal );
    }
}
