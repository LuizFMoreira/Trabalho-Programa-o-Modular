package Codigo;

public class Projeto {
    private String nome;
    private Profissional orientador;
    private Equipe equipe;
    private int notaFinal;
    
    public Projeto(Profissional orientador, Equipe equipe, int notaFinal) {
        this.orientador = orientador;
        this.equipe = equipe;
        this.notaFinal = notaFinal;
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
    
    
}
