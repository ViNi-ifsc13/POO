package ads.poo;

import java.util.ArrayList;

public class Email {

    // Atributos

    private String rotulo;
    private String valor;

    // Métodos Construtor

    public Email(String rotulo, String valor) {
        this.rotulo = rotulo;
        this.valor = valor;
    }

    // Métodos


    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getRotulo() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }
}
