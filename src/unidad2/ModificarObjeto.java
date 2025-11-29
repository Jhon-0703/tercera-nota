package unidad2;

class Rectangulo {
    int ancho;
    int alto;

    Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
}

public class ModificarObjeto {

    public static void modificarRectangulo(Rectangulo r) {
        r.ancho = 50;
        r.alto = 30;
        System.out.println("Dentro del método: ancho = " + r.ancho + ", alto = " + r.alto);
    }

    public static void main(String[] args) {
        Rectangulo miRectangulo = new Rectangulo(10, 20);
        System.out.println("Antes de modificar: ancho = " + miRectangulo.ancho + ", alto = " + miRectangulo.alto);
        modificarRectangulo(miRectangulo);
        System.out.println("Después de modificar: ancho = " + miRectangulo.ancho + ", alto = " + miRectangulo.alto);
    }
}

