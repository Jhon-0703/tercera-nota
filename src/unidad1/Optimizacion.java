package unidad1;

public class Optimizacion {
     public static void main(String[] args) {
        double[] prodeuctoPrecios = {100, 200};
        double[] impuestos = {0.15, 0.10};
        double total[] = new double[2];
        double totalTax = 0;
        int impuestoMax = 50;
        //double productPrice1 = 100;
       // double productPrice2 = 200;
        //double tax1 = productPrice1 * 0.15;
        //double tax2 = productPrice2 * 0.10;
       // double totalTax = tax1 + tax2;
       //Calcular impuestos
       for (int i = 0; i < prodeuctoPrecios.length; i++) {
         total[i] = prodeuctoPrecios[i] * impuestos[i];
         totalTax += total[i];
       }
        
       

        if (totalTax > impuestoMax) {
            System.out.println("High total tax: " + totalTax);
        } else {
            System.out.println("Low tax");
        }
    }

} 
