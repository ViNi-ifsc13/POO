package ads.poo;

public class Caneta {

    // Atributos
    private String cor;    // ""
    private double nivelTinta;  // 0.0
    private boolean aberta; // false

    // Métodos

    public boolean abrirFechar(){
        aberta = !aberta;
        return aberta;
    }

    public String getCor(){
        return cor;
    }
    public double getNivelTinta(){
        return nivelTinta;
    }


    public void setCor(String c){
        cor = c;
    }
    public void setNivelTinta(double p){
        nivelTinta = p;
    }

    public boolean isAberta() {
        return aberta;
    }

    public String desenhar(int x1, int y1, int x2, int y2) {
        //calcula a distância
        //debitar do nível de tinta
        //retornar a distância percorrida
        //Ex: Desenhei 1cm na cor azul

        if (aberta) {

            double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2)));
            double consumo = distancia * 0.01;
            if (nivelTinta >= consumo) {
                nivelTinta -= consumo;

                return String.format("Desenhei %s cm na cor %s!", distancia, cor);
            }else{
                return "Não há tinta suficiente para desenhar";
            }
        }else{
            return "A tampa está fechada, abra a tampa!";
        }
    }

}
