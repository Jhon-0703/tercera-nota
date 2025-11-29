package unidad2;
class Persona {
    String nombre;
}

public class Ejemplo2TiposPrimitivosObj {
       
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Juan";
        cambiarNombre(persona);
        System.out.println("Después de cambiarNombre: " + persona.nombre);  // Imprime Pedro
    }

    public static void cambiarNombre(Persona persona) {
        persona.nombre = "Pedro";
        System.out.println("Dentro de cambiarNombre: " + persona.nombre);  // Imprime Pedro
    }
}
