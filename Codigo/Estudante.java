package Codigo;

import java.time.LocalDate;

public class Estudante extends Pessoa {
   private String matricula;

    public Estudante(String matricula, String nome, String cpf, LocalDate dataNascimento) {
        super(nome, cpf, dataNascimento);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
}
