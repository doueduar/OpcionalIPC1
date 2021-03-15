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
        // inicializando a bestias con el metodo interno 
        this.inicializarBestias();
        // 
        this.presentarPersonajes(ejercitoBestias);

        this.inicializarHeroes();
        
        this.presentarPersonajes(ejercitoHeroes);
   
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

    public void inicializarHeroes(){
        int random = 0;
        for (int i = 0; i < ejercitoHeroes.length; i++) {
            random = Dado.tirarDado(0, 2, 1, false);
            switch (random) {
                case 0:
                    ejercitoHeroes[i] = new Humanos("Humano "+Humanos.getInstancias());
                    break;
                case 1:
                    ejercitoHeroes[i] = new Elfos("Elfo "+Elfos.getInstancias());
                    break;
                case 2:
                    ejercitoHeroes[i] = new Hobbits("Hobbit "+Hobbits.getInstancias());
                    break;
                default:
                    ejercitoHeroes[i] = new Elfos("Elfo "+Elfos.getInstancias());
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
