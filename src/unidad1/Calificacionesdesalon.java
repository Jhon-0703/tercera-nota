package unidad1;

import java.util.Scanner;

public class Calificacionesdesalon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] calificaciones =  new double[10];
        double suma = 0;
        double Calificaciones = calificaciones.length;
        //ingresar calificaciones
        for (int i = 0; i < Calificaciones; i++) {
            System.out.print("Ingrese la calificacion" + (i+1) + ": ");
            calificaciones[i]= scanner.nextDouble();
            suma += calificaciones[i];
        }
        // promedio
        double promedio = suma/Calificaciones ;
        System.out.println("el promedio de las calificciones es: "+ promedio);
        scanner.close();
    }



    
}
