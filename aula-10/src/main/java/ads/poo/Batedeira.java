package ads.poo;

public class Batedeira {
    // Atributos

    private String modo;
    private int nivel = 1;
    private boolean ligar;

    // Métodos

    public void setModo(String mo){
        modo = mo;
    }
    public void setNivel(int ni){
        nivel = ni;
    }
    public void ligarDesligar(){
        ligar = !ligar;
    }

    public String getModo(){return modo;}
    public int getNivel(){return nivel;}
    public boolean getLigar(){return ligar;}
}
