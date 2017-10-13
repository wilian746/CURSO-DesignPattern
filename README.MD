Projeto Design Pattern
=====================

#### SEJA FELIZ POR QUE DEUS É BÃO 

## Instalação

Certifique-se que você tenha instalado o [NetBeans](https://netbeans.org/downloads/) em sua máquina.

- Clone o projeto para sua máquina:

```bash
$ git clone <LINK DO REPOSITÓRIO>
```

- Abra o NetBeans, vá ao destino do projeto aonde você clonou e clique em abrir.

## O PROJETO

- Este projeto é sobre um personagem que constantemente tem que olhar o terreno que ele está MOVIMENTANDO e olhar sua stamina para não ficar CANSADO e sempre está de olho nas notificações de sua VIDA

## COMPOSIÇÃO DO PROJETO

#### Principal 

- No pacote TrabalhoFelipe tem a classe Personagem que faz composição com as interfaces Estado, FormaMovimento, Observador. Nessa mesma classe podemos contar com vários metodos aonde faz a ligação com os demais pacotes.

- No mesmo pacote TrabalhoFelipe tem a classe TrabalhoFelipe aonde contem nossa MAIN e faz a execução de todo o projeto. Sua visualização é melhor graças ao pattern Builder
```bash
public class TrabalhoFelipe {
    public static void main(String[] args) {
        Personagem MarioGordoBros = new Personagem();

        MarioGordoBros = new PersonagemBuilder()
                .estaAndandoNa("terra")
                .por(15)
                .pontosDeVida(19)
                .build();

        System.out.println(MarioGordoBros);
    }
}
```

#### State

- No pacote TrabalhoFelipe.State é o pattern State que mostra o personagem cansado ou normal.

#### Strategy

- No pacote TrabalhoFelipe.Strategy é o pattern Strategy que faz a ação do lugar que o personagem está no momento, fazendo ele Voar, Andar, Nadar.

#### Observer

- No pacote TrabalhoFelipe.Observer é o pattern Observer que faz a notificação quando a vida do personagem está a baixo de 20.

#### Factory

- No pacote TrabalhoFelipe.Factory é o pattern Factory Method que faz a regra de negocio que verifica o ESTADO que o personagem se encontra. O personagem que está a mais de 15 segundos se movimentando ele irá ficar cansado, caso contrario ele está se movimentando normalmente. E mesma essa classe verifica o LOCAL que o personagem está andando podendo ser "agua", "ar", "terra".

#### Builder

- No pacote TrabalhoFelipe.Builder é o pattern Builder. Ele faz com que outros patterns sejam obrigatorios assim facilitando sua identificação na criação do objeto.