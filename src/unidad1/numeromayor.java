package unidad1;

import java.util.Scanner;

public class numeromayor {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        boolean resultado = (num1 > num2) && (num1 < num3);

        System.out.println("¿El primer número es mayor que el segundo y menor que el tercero? " + resultado);
    }
}

