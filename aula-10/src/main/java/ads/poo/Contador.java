package ads.poo;

public class Contador {
    // Atributos

    private int valorAtual = 0;

    // Métodos
    public int incrementar(){
        valorAtual ++;
        return valorAtual;
    }

    public String reset(){
        valorAtual = 0;
        return "O contador foi resetado!";
    }

    public String contagem(){
            return "O contador atual marca: " + valorAtual;
    }


}
