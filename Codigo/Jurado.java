package Codigo;

public class Jurado {
    private String nome;
    private double nota;

    public Jurado(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }
}
