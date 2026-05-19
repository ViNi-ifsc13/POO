package ads.poo.personagens;

public class Arqueiro extends Personagem implements Guerreiro{

    // Atributos

    //Métodos construtor

    public Arqueiro() {
        super(35,2,1);
    }

    //Métodos

    @Override
    public String atacar(){
        return "O arqueiro solta uma flechada" + super.atacar();
    }

    public String mover(){
        return "O arqueiro se locomove" + super.mover();
    }
}
