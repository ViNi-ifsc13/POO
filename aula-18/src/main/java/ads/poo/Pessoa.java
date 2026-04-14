package ads.poo;

public class Pessoa {

    // Atributos

    private String cpf;
    private String nome;

    // Métodos Construtor

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    // Métodos
}
