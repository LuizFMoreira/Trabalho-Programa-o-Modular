package Codigo;

import java.time.LocalDateTime;

public class Profissional extends Pessoa {
    private String profissao;
    private Double salario;
   
    public Profissional(String nome, String cpf, LocalDateTime dataNascimento, String profissao, Double salario) {
        super(nome, cpf, dataNascimento);
        this.profissao = profissao;
        this.salario = salario;
    }

    public String getProfissao() {
        return profissao;
    }

    public Double getSalario() {
        return salario;
    }

    
}
