package src;
import src.personajes.bestias.*;
import src.personajes.heroes.*;
import src.personajes.Bestias;
import src.personajes.Heroes;
import src.personajes.Personajes;

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

        this.inicializarBestias();
        this.presentarPersonajes(ejercitoBestias);
   
    }
    public void inicializarBestias(){
        int random = 0;
        // utiliza el for para calcular la cantidad del ejercito que se tiene 
        //con el length 
        for (int i = 0; i < ejercitoHeroes.length; i++) {
            random = Dado.tirarDado(0, 1, 1, false);
            switch (random) {
                case 0:
                    ejercitoBestias[i] = new Trasgos("Trasgo "+Trasgos.getInstancias());
                    break;
                case 1:
                    ejercitoBestias[i] = new Orcos("Orco "+Orcos.getInstancias());
                    break;
                default:
                    ejercitoBestias[i] = new Orcos("Orco "+Orcos.getInstancias());
                    break;
            }
        }
    }

    public void presentarPersonajes( Personajes ejercito[]){

        if (ejercito.length> 0 ){
            String tempo = "";
            if (ejercito[0] instanceof Bestias){
                tempo = "Bestia";
            }
            else{
                tempo = "Heroe";
            }

            System.out.println("\nPresentando ejercito de "+tempo);
            //ejemplo con operador ternario
            /**System.out.println("\nPresentando ejercito de "+
                            (ejercito[0] instanceof Bestias?"Bestias":"Herores")
                            );**/

            for (int i = 0; i < ejercito.length; i++) {
                ejercito[i].saludar();
            }

        }
        else {
            System.out.println("No hay un ejercito ");
        }
    }

}
