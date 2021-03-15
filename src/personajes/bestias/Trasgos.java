package src.personajes.bestias;

import src.personajes.Bestias;

public class Trasgos extends Bestias{
    
    private static int contadorInstancias;

    public Trasgos(String nombre){
        super(325, 45, nombre);
    }
    
    public static int getInstancias(){
        return Trasgos.contadorInstancias;
    }
}
