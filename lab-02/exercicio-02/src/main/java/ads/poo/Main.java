package ads.poo;

import java.util.Random;

public class Main {
    static void main() {
        Random r = new Random();
        int i = r.nextInt(101);
        int tentativas = 0;


        IO.println("Acerte um número de 1 a 100!");
        int palpite = 0;


       while (palpite != i) {
           palpite = Integer.parseInt(IO.readln("Entre com um número: "));
           if (palpite > i)
               IO.println("Seu palpite foi maior que o número!");
           else {
               IO.println("Seu palpite foi menor que o número!");
           }
           tentativas++;
       }


        IO.println("Parabéns você acertou!!");
        IO.println("Foram necessárias " + tentativas + " tentativas!");
    }

}
