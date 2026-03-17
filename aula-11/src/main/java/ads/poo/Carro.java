package ads.poo;

public class Carro {

    // Atributos
    private  String modelo; //""
    private int velocidadeAtual; // 0
    private int velocidadeMax; // 0

    public static final int VEL_MAX_MODELOS = 300;
    public static final int VEL_MIN_MODELOS = 0;



    // Métodos construtor


    public Carro(String modelo, int velocidadeMax) {
        if(velocidadeMax > VEL_MAX_MODELOS){
            velocidadeMax = VEL_MAX_MODELOS;
        }
        this.modelo = modelo;
        this.velocidadeMax = velocidadeMax;
        this.velocidadeAtual = 0;
    }

    public Carro(String modelo) {
        this.modelo = modelo;
        this.velocidadeMax = VEL_MAX_MODELOS;
    }

    // Métodos

    public void acelerar(int a){
        if (velocidadeAtual + a <= velocidadeMax){
        velocidadeAtual += a;
    }else{
            velocidadeAtual = velocidadeMax;
        }
    }

    public void frear(int d){
        if(velocidadeAtual - d > VEL_MIN_MODELOS) {
            velocidadeAtual -= d;
        }else{
            velocidadeAtual = VEL_MIN_MODELOS;
        }
    }
    public int getVelocidadeAtual(){
        return velocidadeAtual;
    }
    public String getModelo(){
        return modelo;
    }
}
