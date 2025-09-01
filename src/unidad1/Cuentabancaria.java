package unidad1;

public class Cuentabancaria {
        public static void main(String[] args) {
        // Dinero inicial
        int dineroInicial = 1000;

        // Retiro fijo cada semana
        int retiroSemanal = 200;

        // Número de semanas en un mes
        int semanas = 4;

        // Calcular el dinero restante
        int dineroFinal = dineroInicial - (retiroSemanal * semanas);

        // Mostrar resultados
        System.out.println("Dinero inicial: " + dineroInicial);
        System.out.println("Cantidad retirada cada semana: " + retiroSemanal);
        System.out.println("Semanas: " + semanas);
        System.out.println("Dinero restante en la cuenta al final del mes: " + dineroFinal);
    }
}

