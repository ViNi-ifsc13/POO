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

        draw.setPenColor(Color.GREEN);

        for (int i = 0; i < 800; i+=5) {
            draw.line(i,0,i,800);
            draw.line(0,i,800,i);
        }


        draw.show();

        draw.setFontSize(30);

//        for (int i = 0; i < 10; i++) {
//            draw.clear();
//            draw.text(400,400,"" + i);
//            draw.show();
//            TimeUnit.SECONDS.sleep(1);
//
//        }

        // TODO contador até 10, aparecer coração (desafio dia dos namorados)

        draw.filledCircle(300,500,100);
        draw.filledCircle(450,500,100);
        double[] x1 = {300,350,350,450};
        double[] y1 = {500,150,150,500};
        draw.filledPolygon(x1,y1);
        draw.show();
        }
    }

