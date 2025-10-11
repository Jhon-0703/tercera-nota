package unidad1;

import java.util.Scanner;

public class Colores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] colores = {"amarillo", "azul", "rojo" };
        System.out.print("Ingrese un color: ");
        String color = scanner.nextLine();
        boolean esPrimario = false;
        for (int i = 0; i < colores.length; i++) {
            if (color.equalsIgnoreCase(colores[i])) {
              esPrimario = true;
              break;
            } 
           
        }
          if (esPrimario) {
                System.out.println("El color " + color + " es primario");
            }else {
             System.out.println("El color " + color + " no es primario" );
            }  

        scanner.close();
    }
}
