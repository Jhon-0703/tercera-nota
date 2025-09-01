package unidad1;
public class Tienda {
    public static void main(String[] args) {
        // Precios originales
        double camiseta = 25;
        double pantalon = 30;

        // Aplicar 15% de descuento
        double camisetaConDescuento = camiseta - (camiseta * 0.15);
        double pantalonConDescuento = pantalon - (pantalon * 0.15);

        // Segunda camiseta con 5% adicional sobre el precio ya descontado
        double segundaCamiseta = camisetaConDescuento - (camisetaConDescuento * 0.05);

        // Precio total
        double total = camisetaConDescuento + pantalonConDescuento + segundaCamiseta;

        // Mostrar resultado
        System.out.println("El precio de la primera camiseta : " + camisetaConDescuento);
        System.out.println("El precio del pantalon : " + pantalonConDescuento);
        System.out.println("El precio de la segunda camiseta : " + segundaCamiseta);
        System.out.println("El precio total a pagar es: " + total);
    }
}
