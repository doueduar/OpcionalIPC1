package src.personajes;

public class Bestias extends Personajes {
    private static int ataqueMaximo = 90;
    //private static int instanciasBestias;

    public Bestias(int vida, int armadura, String nombre){
        super(vida, armadura, ataqueMaximo, nombre, false);
    }
}
