package ads.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contato {

    // Atributos

    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private ArrayList<Email> colecaoEmail;
    private ArrayList<Telefone> colecaoTelefone;

    // Métodos Construtor

    public Contato(String nome, String sobrenome, LocalDate dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
    }


    // Métodos

    public boolean addTel(String rotulo, String valor){

        rotulo = IO.readln("Insira o rótulo de telefone");
        valor = IO.readln("Insira o número de telefone");
            String eR = "^[0-9]+$";

            if(valor.matches(eR)){
                var novoTelefone = new Telefone(rotulo, valor);

                this.colecaoTelefone.add(novoTelefone);
                return true;
            } else {return false;}


    }


    // FIXME interação com usuário fica no app

    public boolean addEmail(String rotulo, String valor){

        rotulo = IO.readln("Insira o rótulo de email");
        valor = IO.readln("Insira o endereço de email");

            String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

            if(valor.matches(eR)){
                var novoEmail = new Email(rotulo, valor);

                this.colecaoEmail.add(novoEmail);
                return true;
            } else {return false;}

    }
}
