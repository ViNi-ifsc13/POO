package ads.poo;

public class Motor {

    // Atributos

    private int hp;
    private int giroAtual;
    private int cilindros;


    // Métodos Construtor

    public Motor(int hp, int giroAtual, int cilindros) {
        this.hp = 144;
        this.giroAtual = 2;
        this.cilindros = 10;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "hp=" + hp +
                ", giroAtual=" + giroAtual +
                ", cilindros=" + cilindros +
                '}';
    }

    // Métodos


    public void acelerar(int v){
        this.giroAtual++;
    }



}
