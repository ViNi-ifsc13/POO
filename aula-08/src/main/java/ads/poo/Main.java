package ads.poo;

public class Main {
    static void main(String[] args) {

// Tudo sobre a lampada
//        Lampada a = new Lampada();
//        Lampada b = new Lampada();
//
//        if (a.isLigada()){
//            System.out.println("A lâmpada está ligada!");
//        }else{
//            System.out.println("A lâmpada está desligada!");
//        }
//
//        a.ligarDesligar();
//
//        System.out.println(a.isLigada());
//        System.out.println(b.isLigada());

        Caneta bic = new Caneta();
        bic.abrirFechar();

        bic.setCor("azul");
        bic.setNivelTinta(0.07);

        String cor = bic.getCor();

        IO.println(bic.desenhar(2,2,9,2));
        IO.println(bic.getNivelTinta());

    }
}