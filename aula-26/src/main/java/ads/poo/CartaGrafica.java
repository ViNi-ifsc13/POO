package ads.poo;

import edu.princeton.cs.algs4.Draw;

public class CartaGrafica extends Carta {

    private int x;
    private int y;
    private boolean virada;

    public CartaGrafica(Naipe naipe, Valor valor, int x, int y) {
        super(naipe, valor);
        this.x = x;
        this.y = y;
    }

    public void desenhar(Draw d) {
        Naipe naipe = this.naipe;
        Valor valor = this.valor;

        d.picture(this.x,this.y, "cartas/" +valor.inicial + naipe.inicial + ".png");
        d.show();
    }

    public boolean clicouDentro(double x, double y){
        if (this.x > (this.x + 36) && this.x < (this.x -  36)
         && this.y > (this.y + 48) && this.y < (this.y - 48)){
            return false;
        }else{
            return true;
        }
    }
}
