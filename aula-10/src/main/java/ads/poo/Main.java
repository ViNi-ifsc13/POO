package ads.poo;

public class Main {
    static void main() {

        Contador a = new Contador();
        Personagem b = new Personagem();
        Batedeira c = new Batedeira();
        Disciplina d = new Disciplina();

//        IO.println(a.incrementar());
//        IO.println(a.incrementar());
//        IO.println(a.contagem());
//        IO.println(a.reset());



//        b.setNome("Kleber");
//        b.setClasse("Mago");
//        IO.println(b.getClasse());
//        IO.println(b.getNome());
//        IO.println(b.status());
//        IO.println(b.aumentarNivel());
//        IO.println(b.aumentarNivel());
//        IO.println(b.aumentarNivel());
//        IO.println(b.aumentarNivel());
//        IO.println(b.aumentarNivel());
//        IO.println(b.status());
//        IO.println(b.derrotado());


//        c.setModo("Gancho");
//        c.setNivel(10);
//        c.ligarDesligar();
//
//        IO.println(c.getModo());
//        IO.println(c.getNivel());
//        IO.println(c.getLigar());

        d.setNome("Matematica");
        d.setProfessor("Volnei");
        d.setCargaHoraria(90);
        d.setRequisitos("Fundamental II");

        IO.println(d.getNome());
        IO.println(d.getProfessor());
        IO.println(d.getCargaHoraria());
        IO.println(d.getRequisitos());

    }
}