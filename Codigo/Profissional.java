package Codigo;

import java.time.LocalDate;

public class Profissional extends Pessoa {
    protected  String profissao;
    protected  Double salario;
   
    public Profissional(String nome, String cpf, LocalDate dataNascimento, String profissao, Double salario) {
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
