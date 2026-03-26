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

    public long horarioParaSegundos(){
        int s = (horas * 3600) + (minutos * 60) + segundos;
        return s;
    }

    public long diferencaHoras(Horario diferenca){
        long dif = Math.abs(diferenca.horarioParaSegundos() - this.horarioParaSegundos());
        return dif;
    }

    public String tabelaExtenso(int num){
        return switch (num){
            case 1 -> "um";
            case 2 -> "dois";
            case 3 -> "três";
            case 4 -> "quatro";
            case 5 -> "cinco";
            case 6 -> "seis";
            case 7 -> "sete";
            case 8 -> "oito";
            case 9 -> "nove";
            case 10 -> "dez";
            case 11 -> "onze";
            case 12 -> "doze";
            case 13 -> "treze";
            case 14 -> "catorze";
            case 15 -> "quinze";
            case 16 -> "dezesseis";
            case 17 -> "dezesete";
            case 18 -> "dezoito";
            case 19 -> "dezenove";
            case 20 -> "vinte";
            case 30 -> "trinta";
            case 40 -> "quarenta";
            case 50 -> "cinquenta";

            default -> "";
        };
    }

    public String conversaoExtenso(){
        String lastH;
        String lastM;
        String lastS;

        if (horas > 20) {
            int dezenaH = (horas / 10) * 10;
            int unidadeH = horas % 10;
            lastH = tabelaExtenso(dezenaH) + " e " + tabelaExtenso(unidadeH);
        }else {
            lastH = tabelaExtenso(horas);
        }

        if (minutos > 20 && minutos != 30 && minutos != 40 && minutos != 50) {
            int dezenaM = (minutos / 10) * 10;
            int unidadeM = minutos % 10;
            lastM = tabelaExtenso(dezenaM) + " e " + tabelaExtenso(unidadeM);
        }else {
            lastM = tabelaExtenso(minutos);
        }

        if (segundos > 20 && segundos != 30 && segundos != 40 && segundos != 50) {
            int dezenaS = (segundos / 10) * 10;
            int unidadeS = segundos % 10;
            lastS = tabelaExtenso(dezenaS) + " e " + tabelaExtenso(unidadeS);
        }else{
            lastS =  tabelaExtenso(segundos);
        }

        return lastH + " horas, " +
               lastM + " minutos e " +
               lastS + " segundos";
    }
}
