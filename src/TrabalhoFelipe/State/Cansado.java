
package TrabalhoFelipe.State;


public class Cansado implements Estado{

    @Override
    public void estadoDeComoEstaMovimentando() {
       System.out.println("SUA STAMINA ACABOU AGORA VOCÊ ESTÁ CANSADO");
    }
    
}
