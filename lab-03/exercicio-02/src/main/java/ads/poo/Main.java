package ads.poo;

public class Main {
    static void main() {

        Horario h = new Horario(20,50,30);
        Horario l = new Horario(23,13,5);
        System.out.println(h);

        System.out.println(h.horarioParaSegundos());

        System.out.println(h.diferencaHoras(l));

        System.out.println(h.conversaoExtenso());

        }
    }
