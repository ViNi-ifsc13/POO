package ads.poo;

public class Ponto {

    // Atributos

    private int x;
    private int y;
    private int p;



    // Métodos construtor

    public Ponto(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Ponto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    // Métodos

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double calcular(Ponto p) {
        double distan = Math.sqrt((Math.pow((p.x - this.x),2) + (Math.pow((p.y - this.y), 2))));
     return distan;
    }
}
