package ads.poo;

public enum NaipeCarta {
    OUROS(1,"ouros"),
    COPAS(2,"copas"),
    ESPADAS(3,"espadas"),
    PAUS(4,"paus");

    private int naipe;
    private String extenso;

    NaipeCarta(int naipe, String extenso) {
        this.naipe = naipe;
        this.extenso = extenso;
    }


    @Override
    public String toString() {
        return  extenso;
    }
}
