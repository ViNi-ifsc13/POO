package ads.poo;

public class Conta {

    // Atributos

    private double saldo;
    private String nome;
    private String numConta;

    // Métodos Construtor

    public Conta(double saldo, String nome, String numConta) {

        this.saldo = (saldo > 0) ? saldo : 0;
        this.nome = nome;
        this.numConta = numConta;
    }

    @Override
    public String toString() {
        return String.format("""
                Conta: %s
                Titular: %s
                Saldo: %s
                """,numConta,nome,saldo);

    }
    // Métodos

    public void depositar(double valor){
        this.saldo += (valor > 0) ? valor : 0;
    }

    public void sacar(double valor){
        this.saldo -= (valor > saldo) ? 0 : (valor>0) ? valor : 0;
    }
}
