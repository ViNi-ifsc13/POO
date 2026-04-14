package ads.poo;

public class Capitulo {

    // Atributos
    private String titulo;

    // Métodos construtor

    public Capitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Capitulo{" +
                "titulo='" + titulo + '\'' +
                '}';
    }
}
