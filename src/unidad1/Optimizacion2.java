package unidad1;

public class Optimizacion2 {
    public static void main(String[] args) {
        int[] precios = {15, 10, 5};
        int[] Cantidad = {2, 3, 4};
        int tamanioArreglo = precios.length;
        int[] totales = new int[precios.length];
        int totalSales = 0;
        int maximoSales= 50;

        for (int i = 0; i < tamanioArreglo; i++) {
            totales[i] = precios[i] * Cantidad[i];
            totalSales += totales[i];
        }
        


        
       // int p1 = 15;
        //int p2 = 10;
        //int p3 = 5;

       // int total1 = p1 * 2;
       // int total2 = p2 * 3;
        //int total3 = p3 * 4;

        // int totalSales = total1 + total2 + total3;

        if (totalSales > maximoSales) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}
