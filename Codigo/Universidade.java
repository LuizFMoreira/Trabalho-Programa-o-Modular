package Codigo;

public class Universidade extends Instituicao { 
    private double tamanho;

    public Universidade(String nome, double tamanho) {
        super(nome);
        this.tamanho = tamanho;
    }

    public double getTamanho() {
        return tamanho;
    }
}
