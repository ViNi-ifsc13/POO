package ads.poo;


public class App {
    static void main() {

        String sigla = IO.readln("Entre com a sigla da matéria: ");
        int dia1 = Integer.parseInt(IO.readln("Entre com o primeiro dia da matéria: "));
        int dia2 = Integer.parseInt(IO.readln("Entre com o segundo dia da matéria: "));

        DiaDaSemana primeiro = DiaDaSemana.getByCodigo(dia1);
        DiaDaSemana segundo = DiaDaSemana.getByCodigo(dia2);

    Disciplina poo = new Disciplina(sigla,new DiaDaSemana[]{primeiro,segundo});

    //Banco de dados: int
    // Interface: String (segunda-feira)
    IO.println(poo);
    // Sigla: POO
    // Dias com aula:


        // Parte 2 - Exercício 1

        int planeta = Integer.parseInt(IO.readln("Entre com a posição de planeta desejada: "));

        IO.println(PlanetasSistemaSolar.getByPosicao(planeta));
        
        
        // Exercício 2
        
        


    }
}
