package unidad1;

import java.util.Scanner;

public class DatosPersona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[3];
        int[] edades = new int[3];
        int[] documentos = new int[3];
        int edadMinima = 18;
        int tamanioArreglo = nombres.length;
        for (int i = 0; i < tamanioArreglo; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
            System.out.print("Ingrese la edad de la persona " + (i + 1) + ": ");
            edades[i] = scanner.nextInt();
            System.out.print("Ingrese el documento de la persona " + (i + 1 ) + ": ");
            documentos[i] = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("----------------------------------------------");
        System.out.println(" Lista de los datos del usuario");
        for (int i = 0; i < tamanioArreglo; i++) {
            if (edades[i] >= edadMinima) {
                System.out.println("el nombre de la persona " + (i+1) + " es " + nombres[i]+ " Y su documento es " + documentos[i] + " su edad es " + edades[i] );
                System.out.println("Es mayor de edad ");
            } else {
                System.out.println("el nombre de la persona " + (i+1) + " es " + nombres[i]+ " Y su documento es " + documentos[i] + " su edad es " + edades[i] );
                System.out.println("Es menor de edad ");
            }
            
        }
        scanner.close();
    }
    
}
