package ads.poo.personagens;

public class Cavaleiro extends Personagem implements Guerreiro{

    // Atributos

    //Métodos construtor

    public Cavaleiro() {
        super(50,3,2);
    }

    //Métodos



//    public String atacar(){
//        return "O cavaleiro saca a espada e golpeia" + super.atacar();
//    }
//
//    public String mover(){
//        return "O cavaleiro começa a andar" + super.mover();
//    }
//}

    @Override

    public String atacar(){
        return "O cavaleiro saca a espada e golpeia";
    }

    public String mover(){
        return "O cavaleiro começa a andar";
    }
}
