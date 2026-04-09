package ads.poo;

public class Livro {

    // Atributos

    private final String isbn;
    private String nome;
    private String genero;
    private String autor;
    private int ano;

    // Métodos construtor



    public Livro(String isbn, String nome, String genero, String autor, int ano) {
        this.isbn = isbn;
        this.nome = nome;
        this.genero = genero;
        this.autor = autor;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return  "ISBN = " + isbn + '\n' +
                "Nome = " + nome + '\n' +
                "Genero = " + genero + '\n' +
                "Autor = " + autor + '\n' +
                "Ano = " + ano;
    }

    // Métodos


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getIsbn() {
        return isbn;
    }
}
