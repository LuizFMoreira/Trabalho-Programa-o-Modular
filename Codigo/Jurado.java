package Codigo;

import java.time.LocalDate;

public class Jurado extends Profissional {
    private int experiencia;
    private int id=0;

    public Jurado(String nome, String cpf, LocalDate dataNascimento, String profissao, Double salario,
            int experiencia) {
        super(nome, cpf, dataNascimento, profissao, salario);
        this.experiencia = experiencia;
        id++;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public int getId() {
        return id;
    }
    
}
