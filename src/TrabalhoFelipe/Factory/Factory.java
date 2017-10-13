
package TrabalhoFelipe.Factory;


import TrabalhoFelipe.State.Cansado;
import TrabalhoFelipe.State.Estado;
import TrabalhoFelipe.State.Normal;
import TrabalhoFelipe.Strategy.Andar;
import TrabalhoFelipe.Strategy.FormaMovimento;
import TrabalhoFelipe.Strategy.Nadar;
import TrabalhoFelipe.Strategy.Voar;



public class Factory {

    public static Estado tempoAndando(int tempoAndando){
        if(tempoAndando > 15)
            return new Cansado();
        return new Normal();
    }
    public static FormaMovimento lugarDeMovimento(String lugarOndeEstaMovimentando){
        
        if(lugarOndeEstaMovimentando.equalsIgnoreCase("ar"))
            return new Voar();
        if(lugarOndeEstaMovimentando.equalsIgnoreCase("agua"))
            return new Nadar();
        if(lugarOndeEstaMovimentando.equalsIgnoreCase("terra"))
            return new Andar();
        return new Andar();
    }
    
    
}
