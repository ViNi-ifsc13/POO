package ads.poo.personagens;

public abstract class Personagem {

    // Atributos

    protected double vida;
    protected double ataque;
    protected double velocidade;

    //Métodos construtor

    public Personagem(double vida, double ataque, double velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    //Métodos

    public String atacar(){
        return " com " + ataque + " de força!!";
    }
    public String mover(){
        return " com " + velocidade + " de velocidade";
    }
}
