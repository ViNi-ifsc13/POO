package ads.poo.produtos;

public class Semfio extends Telefone {

    // Atributos

    private double frequencia;
    private int canais;
    private double distancia;



    // Métodos construtor

    public Semfio(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao, double frequencia, int canais, double distancia) {
        super(codigo, numSerie, modelo, peso, dimensao); // Construtor da superclasse
        this.frequencia = frequencia;
        this.canais = canais;
        this.distancia = distancia;

    }


    // Métodos


    @Override
    public String toString() {
        return
                "Semfio{" + "\n" + super.toString() +
                "frequencia: " + frequencia + "\n" +
                "canais: " + canais + "\n" +
                "distancia: " + distancia;
    }

    public double getFrequencia() {
        return frequencia;
    }
}
