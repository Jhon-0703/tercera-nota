package unidad1;
import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir precios al usuario
        System.out.println("Ingrese el valor de la camiseta: ");
        double camiseta = scanner.nextDouble();

        System.out.println("Ingrese el valor del pantalon: ");
        double pantalon = scanner.nextDouble();

        // Descuento del 15% a cada prenda
        camiseta = camiseta - (camiseta * 0.15);
        pantalon = pantalon - (pantalon * 0.15);

        // Segunda camiseta con 5% adicional
        double segundaCamiseta = camiseta - (camiseta * 0.05);

        // Total a pagar
        double total = camiseta + pantalon + segundaCamiseta;

        // Mostrar resultados de manera simple
        System.out.println("Precio final de la primera camiseta: " + camiseta);
        System.out.println("Precio final del pantalon: " + pantalon);
        System.out.println("Precio  de la segunda camiseta: " + segundaCamiseta);
        System.out.println("El total a pagar es: " + total);

        scanner.close();
    }
}
