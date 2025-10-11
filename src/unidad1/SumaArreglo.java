package unidad1;

import java.util.Scanner;

public class SumaArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10]; 
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i]; 
        }

      
        double promedio = (double) suma / numeros.length;

        
        System.out.println("La suma de los números es: " + suma);
        System.out.println("El promedio de los números es: " + promedio);

        scanner.close();
    }
}
