package ads.poo;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }


    public void emprestarLivro(String isbn, String cpf) throws EmprestimoEmprestadoException, LimiteEmprestimosException {
        for (Usuario u : usuarios) {
            if (u.getCpf().equals(cpf)) {


            for (Livro l : livros) {
                if (l.getIsbn().equals(isbn)) {
                    if (l.isEmprestado()) {
                        throw new EmprestimoEmprestadoException("Esse livro já foi emprestado!");
                    } else {

                        if (u.getNumLivros() == 3) {
                            throw new LimiteEmprestimosException("Você já pegou 3 livros!");
                        }
                        l.setEmprestado(true);
                        l.setDevolvido(false);
                        u.setNumLivros(u.getNumLivros() + 1);
                    }
                }
            }
        }
    }
    }

    public void devolverLivro(String isbn, String cpf) throws DevolverNaoEmprestadoException{
    for (Usuario u : usuarios) {
        if(u.getCpf().equals(cpf)){

        for (Livro l : livros) {
            if (l.getIsbn().equals(isbn)) {
                if (l.isDevolvido()) {
                    throw new DevolverNaoEmprestadoException("Esse livro nem foi emprestado ainda!");
                } else {
                    l.setDevolvido(true);
                    l.setEmprestado(false);
                    u.setNumLivros(u.getNumLivros()-1);
                }
            }
        }
    }
    }
    }
}
