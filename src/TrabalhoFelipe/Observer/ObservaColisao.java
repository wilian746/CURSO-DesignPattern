
package TrabalhoFelipe.Observer;


public class ObservaColisao implements Observador{

    @Override
    public void notifica(String colidiuComBicho){
        if(colidiuComBicho.equalsIgnoreCase("cogumelo") || colidiuComBicho.equalsIgnoreCase("tartaruga")){
            System.out.println("Você acaba de colidir com bicho  ##Cuidado##");
        }
    }
}
