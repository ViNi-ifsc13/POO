package ads.poo;

import java.util.Random;

public class Dado {

    private int face;
    private int estatisticas[];
    private Random r;

    public Dado() {
        this.face = 1;
        this.estatisticas = new int[6];
        this.r = new Random();
    }


public int jogar(){
    this.face = r.nextInt(6);
    this.estatisticas[this.face]++;
    return (this.face+1);
}
}
