package ads.poo;

public class Carro {

    // Atributos
    private String marca;
    public Motor propulsor;

    // Métodos Construtor

    public Carro(String marca, Motor propulsor) {
        this.marca = marca;
        this.propulsor = propulsor;
    }


    // Métodos

    public void acelerar(int v){
        propulsor.acelerar(v);
    }

    public void trocarMotor(Motor m){
        propulsor = m;
    }


}
