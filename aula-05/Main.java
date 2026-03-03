import java.util.Random;

public class Main {

    static void main(){

        Random r = new Random(123456);

        int i = r.nextInt(10); // 0 até 9 e * -1 para negativo

        System.out.println(i);
    }
}