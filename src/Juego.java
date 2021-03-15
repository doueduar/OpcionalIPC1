package src;
import src.personajes.Bestias;
import src.personajes.Heroes;

public class Juego {
    //inicializar los arreglos de los personajes de la batalla.
    private Bestias ejercitoBestias[];
    private Heroes ejercitoHeroes[];

    private final int CANTIDAD = 5;

    public Juego() {
        // inicializar la cantidad de personajes 
        ejercitoBestias = new Bestias[CANTIDAD];
        ejercitoHeroes = new Heroes[CANTIDAD];
        
    }
    public void jugar(){
        System.out.println("Bienvenido al juego del señor de los anillos: \n\n"); 
    }

}
