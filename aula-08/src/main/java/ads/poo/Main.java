package ads.poo;

public class Main {
    static void main(String[] args) {


        Lampada a = new Lampada();
        Lampada b = new Lampada();

        if (a.isLigada()){
            System.out.println("A lâmpada está ligada!");
        }else{
            System.out.println("A lâmpada está desligada!");
        }

        a.ligarDesligar();

        System.out.println(a.isLigada());
        System.out.println(b.isLigada());




    }
}