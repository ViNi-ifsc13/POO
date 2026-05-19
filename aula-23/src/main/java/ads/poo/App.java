package ads.poo;

import ads.poo.personagens.*;

import java.util.stream.Gatherer;

public class App {

    static void main(String[] args) {

        Aldeao ald = new Aldeao();
        Arqueiro arqueiro = new Arqueiro();
        Cavaleiro cavaleiro = new Cavaleiro();

//        Personagem personagem = new Personagem(1,2,3); -- Com a classe Personagem contendo "abstract" não é possível criar um personagem.

        Personagem[] personagens = new Personagem[3];

        personagens[0] = ald;
        personagens[1] = arqueiro;
        personagens[2] = cavaleiro;

//        if (ald instanceof Guerreiro g){
//            g.atacar();
//        }

        IO.println(ald.atacar());
        IO.println(ald.mover());

        // No mermaid escrever * no final dos métodos, deixa eles em itálico e representa que é um abstract




    }

}
