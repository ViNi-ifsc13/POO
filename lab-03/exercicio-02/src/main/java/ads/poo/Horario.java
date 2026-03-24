package ads.poo;

public class Horario {

    // Atributos

    private int horas;
    private int minutos;
    private int segundos;

    // Métodos construtor

    public Horario() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public Horario(int horas) {
        if(horas > 24 || horas < 0){
            this.horas = 0;
        } else {
            this.horas = horas;
            this.minutos = 0;
            this.segundos = 0;
        }
    }
    public Horario(int horas, int minutos) {
        if(horas > 24 || horas < 0 || minutos > 60 || minutos < 0){
            this.horas = 0;
            this.minutos = 0;
        }else {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = 0;
        }
    }
    public Horario(int horas, int minutos, int segundos) {
        if(horas > 24 || horas < 0 || minutos > 60 || minutos < 0 || segundos > 60 || segundos < 0){
            this.horas = 0;
            this.minutos = 0;
            this.segundos = 0;
        }else {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

    // Métodos

    //todo private boolean validaHora


    public boolean setHoras(int horas) {

        if (horas > 24 || horas < 0){
            horas = 0;
            return false;
        }else{
            this.horas = horas;
        } return true;
    }

    public boolean setMinutos(int minutos) {
        if (minutos > 60 || minutos < 0){
            minutos = 0;
            return false;
        }else{
            this.minutos = minutos;
        } return true;
    }

    public boolean setSegundos(int segundos) {
        if (segundos > 60 || segundos < 0){
            segundos = 0;
            return false;
        }else{
            this.segundos = segundos;
        } return true;
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }
}
