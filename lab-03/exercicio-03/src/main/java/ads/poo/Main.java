package ads.poo;

public class Main {
    static void main() {

        Retangulo r = new Retangulo();

        IO.println(r.setAltura(10));
        IO.println(r.setLargura(10));
        IO.println(r.setCod("ASCII"));

        IO.println(r.area());
        IO.println(r.perimetro());
        IO.println(r.toString());

        }
    }
