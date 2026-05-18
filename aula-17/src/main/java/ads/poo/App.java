package ads.poo;

import java.util.HashMap;
import java.util.Objects;

public class App {

    private HashMap<String, Livro> livros;

    public App(){ livros = new HashMap<>(); }


    void cadastrar() {
        var isbn = IO.readln("Entre com o ISBN do livro: ");
        var nome = IO.readln("Entre com o nome do livro: ");
        var genero = IO.readln("Entre com o gênero do livro: ");
        var autor = IO.readln("Entre com o nome do autor do livro: ");
        var ano = Integer.parseInt(IO.readln("Entre com o ano de lançamento do livro: "));

        var novoLivro = new Livro(isbn, nome, genero, autor, ano);

        this.livros.put(isbn, novoLivro);
    }

    void listarLivros() {
        livros.forEach((isbn, livro) ->
                IO.println(isbn + " - " + livro));
    }

    void listarLivrosAno() {
        var ano = Integer.parseInt(IO.readln("Entre com o ano do livro: "));


        for (Livro livro : livros.values()) {

            var anoDoLivro = livro.getAno();
            if (anoDoLivro == ano) {
                IO.println(livro.toString());
            }
        }
    }

    void atualizarLivros() {
        var isbn = IO.readln("Insira o ISBN do livro que deseja modificar: ");


        for (Livro livro : livros.values()) {
            var livroSelecionado = livro.getIsbn();
            if (Objects.equals(isbn, livroSelecionado)) {
                IO.println("Agora insira as informações atualizadas.");


                var nome = IO.readln("Entre com o nome do livro: ");
                var genero = IO.readln("Entre com o gênero do livro: ");
                var autor = IO.readln("Entre com o nome do autor do livro: ");
                var ano = Integer.parseInt(IO.readln("Entre com o ano de lançamento do livro: "));

                livro.setNome(nome);
                livro.setGenero(genero);
                livro.setAutor(autor);
                livro.setAno(ano);
            }
        }
    }

    void menu(int opcao) {
        while (opcao != 5) {

            String hub = String.format ("""
                    ..:: Menu ::..
                    1 - Cadastrar livro
                    2 - Listar todos os livros
                    3 - Listar todos os livros publicados em um ano específico
                    4 - Alterar dados de um livro
                    5 - Sair""");
            IO.println(hub);

            opcao = Integer.parseInt(IO.readln("Entre com uma opção: "));

            switch (opcao) {

                case 1 -> {cadastrar();}

                case 2 -> {listarLivros();}

                case 3 -> {listarLivrosAno();}

                case 4 -> {atualizarLivros();}

                case 5 -> {IO.println("Encerrando sistema...");}
                }
            }
        }

    static void main(String[] args) {
        App app = new App();
        app.menu(0);

    }
}
