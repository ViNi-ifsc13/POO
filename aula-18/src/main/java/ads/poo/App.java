package ads.poo;

public class App {
    static void main() {

        Motor simples = new Motor();

        // Agregação
        Carro fusca = new Carro("VW", simples);
        fusca = null;
        Carro outro = new Carro("vw", simples);

        // Composição
        Livro livro = new Livro("Java como programar", new Pessoa("123", "gabriel"));

        livro.adicionaCapitulo("Introdução");
        livro.adicionaCapitulo("Desenvolvimento");
        livro.adicionaCapitulo("Conclusão");

        IO.println(livro);

        livro = null;
    }
}