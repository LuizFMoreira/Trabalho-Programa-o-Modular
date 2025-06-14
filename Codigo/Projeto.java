package Codigo;

public class Projeto {
    private String nome;
    private Profissional orientador;
    private Equipe equipe;
    private int notaFinal;

    public Projeto(String nome, Profissional orientador, Equipe equipe) {
        this.nome = nome;
        this.orientador = orientador;
        this.equipe = equipe;
    }

    public Profissional getOrientador() {
        return orientador;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public String getNome() {
        return nome;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

}
