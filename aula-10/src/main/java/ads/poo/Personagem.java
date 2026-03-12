package ads.poo;

public class Personagem {
    // Atributos

    private String nome = "";
    private String classe;

    private int vida = 1;
    private int resistenciaMagica = 1;
    private int velocidadeMovimento = 1;
    private int velocidadeAtaque = 1;
    private int nivel = 1;

    // Métodos

    public String status(){
        if(nome != "") {
            return "         " + nome + " the " + classe + "\n" + "Vida = " + vida + "\n" + "Resistência = " + resistenciaMagica + "\n" + "Velocidade de ataque = " + velocidadeAtaque + "\n" + "Velocidade de movimento = " + velocidadeMovimento;
        }else {
            return "Primerio escolha um nome!";
        }
    }

    public void setNome(String name){
        nome = name;
    }
    public void setClasse(String classeRecebida){
        classe = classeRecebida;
    }
    public String aumentarNivel(){
        vida++;
        resistenciaMagica++;
        velocidadeMovimento++;
        velocidadeAtaque++;
        nivel++;
        return "Nível " + nivel + " atingido!";
    }
    public String derrotado(){
        vida = 1;
        resistenciaMagica = 1;
        velocidadeMovimento = 1;
        velocidadeAtaque = 1;
        nivel = 1;
        return "A nãooo... você foi derrotado :( ";
    }

    public String getNome(){
        return nome;
    }
    public String getClasse(){
        return classe;
    }
}
