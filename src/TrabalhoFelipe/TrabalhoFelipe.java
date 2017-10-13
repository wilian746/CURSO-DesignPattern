
package TrabalhoFelipe;

import TrabalhoFelipe.Builder.PersonagemBuilder;




public class TrabalhoFelipe {

    public static void main(String[] args) {
        Personagem MarioGordoBros = new Personagem();
        
        
        MarioGordoBros = new PersonagemBuilder()
                .estaAndandoNa("terra")
                .por(15)
                .colidiuCom("")
                .build();
    }
    
}
