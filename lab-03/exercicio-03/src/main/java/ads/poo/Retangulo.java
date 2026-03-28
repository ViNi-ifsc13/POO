package ads.poo;

public class Retangulo {

    // Atributos
        private int largura;
        private int altura;
        private String cod;


    // Métodos construtor


    @Override
    public String toString() {
        return
                "*" + "-".repeat(largura - 2) + "*" +
                ("\n|" + " ".repeat(largura - 2) + "|").repeat(altura - 2) +
                "\n*" + "-".repeat(largura - 2) + "*"
                ;
    }

    public Retangulo() {
        this.largura = 4;
        this.altura = 3;
        this.cod = "ASCII";
    }

    public Retangulo(int largura, int altura, String cod) {
        this.largura = largura;
        this.altura = altura;
        this.cod = cod;
    }

    // Métodos


    public int getLargura() {
        return largura;
    }

    public boolean setLargura(int largura) {
        if (largura < 4){
            return false;
        }else{
            this.largura = largura;
            return true;
        }

    }

    public int getAltura() {
        return altura;
    }

    public boolean setAltura(int altura) {
        if (altura < 5){
            return false;
        }else {
            this.altura = altura;
            return true;
        }
    }

    public String getCod() {
        return cod;
    }

    public boolean setCod(String cod) {
        if (cod == "ASCII" || cod == "UTF8"){
            this.cod = cod;
            return true;
        }else {
            return false;
        }
    }

    public double area(){
        int area = this.altura * this.largura;
        return area;
    }

    public double perimetro(){
        int peri = 2 * (this.altura + this.largura);
        return peri;
    }

}
