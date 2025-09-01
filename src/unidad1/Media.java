package unidad1;


    import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double num3 = scanner.nextDouble();

        // Calcular la media
        double media = (num1 + num2 + num3) / 3;

        // Mostrar el resultado
        System.out.println("La media de los tres números es: " + media);
    }
}


