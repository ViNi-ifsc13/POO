package ads.poo;

public enum Naipe {

    OUROS(1,"ouros","o"),
    ESPADAS(2,"espadas","e"),
    COPAS(3,"copas","c"),
    PAUS(4,"paus","p");

    private final int naipe;
    private final String extenso;
    private final String inicial;

    Naipe(int naipe, String extenso, String inicial) {
        this.naipe = naipe;
        this.extenso = extenso;
        this.inicial = inicial;
    }


    @Override
    public String toString() {
        return  extenso;
    }
}
