package ads.poo.personagens;

public class Aldeao extends Personagem implements Guerreiro {

    // Atributos

    //Métodos construtor

    public Aldeao() {
        super(25, 1, 0.8);
    }

    //Métodos

    @Override
    public String atacar(){
        return "O aldeao solta um soco" + super.atacar();
    }

    public String mover(){
        return "O aldeao se arrasta" + super.mover();
    }
}
