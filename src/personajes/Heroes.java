package src.personajes;

public class Heroes extends Personajes {
    private static int instanciasHeroes;
    private static int ataqueMaximo = 100;

    public Heroes (int vida, int armadura, String nombre){
        super(vida, armadura, ataqueMaximo, nombre, true);
        Heroes.instanciasHeroes++;

    }
    public static int getInstancias(){
        return Heroes.instanciasHeroes;
    }
    
}
