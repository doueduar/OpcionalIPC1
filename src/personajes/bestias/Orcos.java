package src.personajes.bestias;

import src.personajes.Bestias;

public class Orcos extends Bestias{

    private static int contadorInstancias;

    public Orcos(String nombre) {
        super(300, 45, nombre);      
    }   
    
    


    public static int getInstancias(){
        return Orcos.contadorInstancias;
    }
}
