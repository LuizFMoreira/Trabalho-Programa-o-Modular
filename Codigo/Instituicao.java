package Codigo;

import java.util.ArrayList;

public abstract class Instituicao {
    protected String nome;
    protected ArrayList<Pessoa>pessoas;
    
    public Instituicao(String nome, ArrayList<Pessoa> pessoas) {
        this.nome = nome;
        this.pessoas = pessoas;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void addPessoa(Pessoa p){
        pessoas.add(p);
    }
}
