package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;
import java.util.concurrent.TimeUnit;


public class App {
    static void main() throws InterruptedException {

        Draw draw = new Draw();

        draw.setCanvasSize(800,800);
        draw.setYscale(0,800);
        draw.setXscale(0,800);

        draw.enableDoubleBuffering();
//        draw.circle(400,400,100);
//
//        draw.setPenColor(Color.GREEN);
//
//        draw.filledCircle(400,400,50);
//
//        draw.square(400,400,50);
//
//        double[] x = {100,150,250,300};
//        double[] y = {100,150,150,100};
//
//        draw.polygon(x,y);


        draw.setXscale(0,800);

        draw.setPenColor(Color.RED);

//        for (int i = 0; i < 800; i+=5) {
//            draw.line(i,0,i,800);
//            draw.line(0,i,800,i);
//        }


        draw.show();

        draw.setFontSize(30);

        for (int i = 0; i < 10; i++) {
            draw.clear();
            draw.text(400,400,"" + i);
            draw.show();
            TimeUnit.SECONDS.sleep(1);

        }


        draw.filledCircle(280,550,197);
        draw.filledCircle(520,550,197);
        double[] x1 = {90,400,710};
        double[] y1 = {500,0,500};
        draw.filledPolygon(x1,y1);

        draw.setFontSize(50);
        draw.setPenColor(Color.GREEN);
        draw.text(400,450,"Karina");
        draw.show();
        }
    }

