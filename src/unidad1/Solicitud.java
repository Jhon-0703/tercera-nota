package unidad1;

import java.util.Scanner;

public class Solicitud {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años y mides " + altura + " metros.");
    }
}



