package ads.poo;

public class Motor {

    // Atributos

    private String tipo;
    private boolean ligado;


    // Métodos Construtor

    public Motor(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "tipo='" + tipo + '\'' +
                ", ligado=" + ligado +
                '}';
    }

    // Métodos

    public boolean isLigado(){
        return ligado;
    }

    public void ligarDesligar(){
        ligado = !ligado;
    }
}
