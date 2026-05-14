package ads.poo.produtos;

public class Dimensao {

    // Atributos

    private double altura;
    private double largura;
    private double profundidade;

    // Métodos construtor

    public Dimensao(double altura, double largura, double profundidade) {
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    // Métodos

    @Override
    public String toString() {
        return "Dimensao:" + "\n" +
                "altura: " + altura + "\n" +
                "largura: " + largura + "\n" +
                "profundidade: " + profundidade;
    }
}
