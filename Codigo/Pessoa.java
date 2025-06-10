package Codigo;

import java.time.LocalDateTime;

public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected LocalDateTime dataNascimento;
    
    public Pessoa(String nome, String cpf, LocalDateTime dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }
    
}
