package Codigo;

import java.util.ArrayList;

public class Empresa extends Instituicao{
    protected String cnpj;
    protected String qntFuncionarios;
    
    public Empresa(String nome, ArrayList<Pessoa> pessoas, String cnpj, String qntFuncionarios) {
        super(nome, pessoas);
        this.cnpj = cnpj;
        this.qntFuncionarios = qntFuncionarios;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getQntFuncionarios() {
        return qntFuncionarios;
    }
    
}
