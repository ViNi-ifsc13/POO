package ads.poo;

public class Livro {

    private String nome;
    private int paginas;
    private String autor;
    private final String isbn;
    protected boolean emprestado;
    protected boolean devolvido;

    public Livro(int paginas, String nome, String autor, String isbn, boolean emprestado, boolean devolvido) {
        this.paginas = paginas;
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
        this.emprestado = emprestado;
        this.devolvido = devolvido;
    }

    public String getNome() {
        return nome;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }
}
