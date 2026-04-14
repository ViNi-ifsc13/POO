package ads.poo;

import java.util.ArrayList;

public class Livro {

    // Atributos

    private String titulo;
    private Pessoa autor;
    private ArrayList<Capitulo> capitulos;

    // Métodos Construtor

    public Livro(String titulo, Pessoa autor, ArrayList<Capitulo> capitulos) {
        this.titulo = titulo;
        this.autor = autor;
        this.capitulos = new ArrayList<>();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        this.capitulos.forEach(sb::append);


        return String.format("""
                Livro: %s
                Autor: %n%s
                Capítulos: %n%s
                """,titulo,autor,sb.toString());
    }

    // Métodos

    public void adicionaCapitulo(String t){

        var novoCapitulo = new Capitulo(t);

        this.capitulos.add(novoCapitulo);
    }
}
