package Codigo;

import java.time.LocalDate;

public class Jurado extends Profissional{
    private double nota;



    public Jurado(String nome, String cpf, LocalDate dataNascimento, double salario, double nota) {
        super(nome, cpf, dataNascimento, salario);
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }
}
