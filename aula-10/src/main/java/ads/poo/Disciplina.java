package ads.poo;

public class Disciplina {

    // Atributos

    private String nome;
    private int cargaHoraria;
    private String professor;
    private String requisitos;

    // Métodos


    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getProfessor() {
        return professor;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }
}
