package unidad1;
public class Marcasmotos {
    public static void main(String[] args) {
        String[] motos = {
            "Yamaha: Crypton", 
            "Yamaha: Xtz", 
            "Yamaha: Ycz", 
            "Yamaha: Fz", 
            "Yamaha: MT09",
            "Suzuki: Gixxer", 
            "Suzuki: Ax4", 
            "Suzuki: Gn125", 
            "Suzuki: Dr650",
            "Bajaj: Boxer", 
            "Bajaj: Pulsar", 
            "Bajaj: Discover"
        };
        System.out.println("Listado de motos:");
        for (int i = 0; i < motos.length; i++) {
            System.out.println((i + 1) + ". " + motos[i]);
        }
    }

}
