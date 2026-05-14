package ads.poo.produtos;

public class Telefone {

    // Atributos

    protected int codigo;
    protected String numSerie;
    protected String modelo;
    protected double peso;
    protected Dimensao dimensao;

    // Métodos construtor

    public Telefone(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao) {
        this.codigo = codigo;
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.peso = peso;
        this.dimensao = dimensao;

    }

    // Métodos

    @Override
    public String toString() {
        return "Telefone:" + "\n" +
                "codigo: " + codigo + "\n" +
                "numSerie: " + numSerie + "\n" +
                "modelo: " + modelo + "\n" +
                "peso: " + peso + "\n" +
                "dimensao: " + dimensao;
    }
}
