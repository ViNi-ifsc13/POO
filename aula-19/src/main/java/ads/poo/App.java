package ads.poo;

public class App {

    static void main() {

        Aviao aviao = new Aviao(50,20,300,3, "turbina");

        aviao.ligarDesligar();

        
        IO.println(aviao.toString());


    }
}
