package unidad1;

import java.util.Scanner;

public class Menuinteractivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== MENÚ DE OPERACIONES ===");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Elige una opción (1-4): ");
        int opcion = scanner.nextInt();

        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado;

        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("La suma es: " + resultado);
                break;

            case 2:
                resultado = num1 - num2;
                System.out.println("La resta es: " + resultado);
                break;

            case 3:
                resultado = num1 * num2;
                System.out.println("La multiplicación es: " + resultado);
                break;

            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("La división es: " + resultado);
                } else {
                    System.out.println("Error: no se puede dividir entre 0.");
                }
                break;

            default:
                System.out.println("Opción inválida.");
                break;
        }

        scanner.close();
    }
}
