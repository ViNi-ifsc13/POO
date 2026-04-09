package ads.poo;

import java.util.HashMap;

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
        for (Livro elemento : livros) {
            IO.println(elemento.toString());
        }
    }

    void listarLivrosAno() {
    }

    void atualizarLivros() {
    }


    void menu(int opcao) {
        while (opcao != 5) {
            opcao = Integer.parseInt(IO.readln("Entre com uma opção: "));

            switch (opcao) {

                case 1 -> {
                    cadastrar();
                }

                case 2 -> {
                    listarLivros();
                }

                case 3 -> {
                    listarLivrosAno();
                }

                case 4 -> {
                    atualizarLivros();
                }

                case 5 -> {
                }

            }

        }
    }


    static void main(String[] args) {

        // Sistema para gestão de acervo de uma Livraria
        // 1 - Cadastrar livro
        // 2 - Listar todos os livros
        // 3 - Listar todos os livros publicados em um ano específico
        // 4 - Alterar dados de um livro
        // 5 - Sair

        App app = new App();
        app.cadastrar();


    }
}
