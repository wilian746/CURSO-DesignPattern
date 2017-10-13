
package TrabalhoFelipe.Builder;

import TrabalhoFelipe.Personagem;
import TrabalhoFelipe.Observer.ObservaColisao;


public class PersonagemBuilder {
    private Personagem personagem = new Personagem();
    
    public PersonagemBuilder estaAndandoNa(String lugar){
        personagem.lugarDeMovimento(lugar);
        personagem.movimentar();
        return this;
    }
    public PersonagemBuilder por(int tempo){
        personagem.tempoAndando(tempo);
        personagem.estadoDeComoEstaMovimentando();
        return this;
    }
    public PersonagemBuilder colidiuCom(String colidiuComBicho){
        personagem.addObservadores(new ObservaColisao());
        personagem.setColisao(colidiuComBicho);
        return this;
    }
    public Personagem build(){
        return personagem;
    }
}
