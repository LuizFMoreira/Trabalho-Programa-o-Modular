package Codigo;

import java.time.LocalDate;

public class Estudante extends Pessoa {
    private String matricula;

    public Estudante(String nome, String cpf, LocalDate dataNascimento, String matricula) {
        super(nome, cpf, dataNascimento);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
    
}
