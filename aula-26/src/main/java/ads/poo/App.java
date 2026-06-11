package ads.poo;

import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

import java.util.ArrayList;

import static ads.poo.Naipe.OUROS;
import static ads.poo.Valor.AS;
import static ads.poo.Valor.DAMA;

public class App implements DrawListener {

    // Texto em UTF-8 para cartas
    // TODO Conseguir colocar uma carta desejada, e poder virar e desvirar ela

    private ArrayList<CartaGrafica> cartaG;
    private Draw draw;

    public App(){
        this.draw = new Draw();
        this.draw.setTitle("Jogo de cartas");
        this.draw.setCanvasSize(1200,600);
        this.draw.setXscale(0,1200);
        this.draw.setYscale(0,600);
        this.draw.setDefaultCloseOperation(3);
        this.draw.enableDoubleBuffering();
        this.draw.addListener(this);

//        for (InterfaceJogos elemento: this.elementos){
//            elemento.desenhar(this.draw);
//        }
        CartaGrafica cg = new CartaGrafica(OUROS, DAMA,100,100);

        cg.desenhar(this.draw);
        this.draw.show();
    }

    @Override
    public void mouseClicked(double x, double y) {

//        for (InterfaceJogos elemento: this.elementos){
//            //polimorfismo
//            if(elemento.clicouDentro(x,y)){
//                //polimorfismo
//                elemento.desenhar(this.draw);
//            }
//        }
        
        this.draw.picture(x,y, "cartas/1c.png");

        this.draw.show();
    }


    static void main(String[] args) {

        App app = new App();

    }
}
