package ads.poo;

import java.util.ArrayList;

public class Aviao {

    // Atributos

    private int passageirosMax;
    private int tripulantesMax;
    private int combustivelMax;
    private boolean ligado;
    private ArrayList<Motor> motores;

    // Métodos Construtor

    public Aviao(int passageirosMax, int tripulantesMax, int combustivelMax, int numMotores, String tipo) {
        if (passageirosMax > 0 && tripulantesMax > 0 && combustivelMax > 0 && (numMotores > 0 && numMotores <= 8)){
            this.passageirosMax = passageirosMax;
            this.tripulantesMax = tripulantesMax;
            this.combustivelMax = combustivelMax;
        }else {
            this.passageirosMax = 0;
            this.tripulantesMax = 0;
            this.combustivelMax = 0;

        }
        this.motores = new ArrayList<>();


        for (int i = 0; i < numMotores; i++) {
            motores.add(new Motor(tipo));

        }
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "passageirosMax=" + passageirosMax +
                ", tripulantesMax=" + tripulantesMax +
                ", combustivelMax=" + combustivelMax +
                ", motores=" + motores +
                '}';
    }

    // Métodos

    public boolean isLigado(){
        return ligado;
    }

    public void ligarDesligar(){

        ligado = !ligado;

            for (Motor elemento : motores ){
                elemento.ligarDesligar();

        }
    }
}
