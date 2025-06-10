package Codigo;

import java.time.LocalDateTime;

public class Jurado extends Profissional {
    private int experiencia;

    public Jurado(String nome, String cpf, LocalDateTime dataNascimento, String profissao, Double salario,
            int experiencia) {
        super(nome, cpf, dataNascimento, profissao, salario);
        this.experiencia = experiencia;
    }

    public int getExperiencia() {
        return experiencia;
    }
    
}
