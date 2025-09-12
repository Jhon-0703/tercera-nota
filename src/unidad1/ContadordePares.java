package unidad1;

public class ContadordePares {
    
    public static void main(String[] args) {
        int contador = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
             contador++;
            }
        }
        System.out.println("Los números pares entre el 1 y el 100 son: " + contador);
    }
}
