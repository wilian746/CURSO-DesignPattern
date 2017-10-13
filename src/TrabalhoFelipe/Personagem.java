
package TrabalhoFelipe;

import java.util.ArrayList;
import java.util.List;
import TrabalhoFelipe.Factory.Factory;
import TrabalhoFelipe.State.Cansado;
import TrabalhoFelipe.State.Estado;
import TrabalhoFelipe.State.Normal;
import TrabalhoFelipe.Strategy.FormaMovimento;
import TrabalhoFelipe.Observer.Observador;

public class Personagem {
    
    private Estado estado;
    private FormaMovimento movimento;
    private List<Observador> observadores = new ArrayList<>();
    private String colidiuComBicho;
    
    public Personagem(){
        this.estado = new Normal();
        this.estado = new Cansado();
    }
    public void estadoDeComoEstaMovimentando(){
        estado.estadoDeComoEstaMovimentando();
    }
    
    public void setEstado(Estado estado){
        this.estado = estado;
    }
    
    public void movimentar(){
        movimento.movimentar();
    }

    public void setFormaMovimento(FormaMovimento movimento) {
        this.movimento = movimento;
    }
    
    public void setColisao(String colidiuComBicho){
        this.colidiuComBicho = colidiuComBicho;
        this.notificaObservadores();
        
    }
    
    public void notificaObservadores(){
        for(Observador o: observadores){
                o.notifica(colidiuComBicho);
        }
    }
    
    public void addObservadores(Observador novoObservador){
        observadores.add(novoObservador);
    }
    
    public void tempoAndando(int tempo){
        this.estado = Factory.tempoAndando(tempo);
    }
    public void lugarDeMovimento(String lugarOndeEstaMovimentando){
        this.movimento = Factory.lugarDeMovimento(lugarOndeEstaMovimentando);
    }    
}
