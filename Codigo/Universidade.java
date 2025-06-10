package Codigo;

import java.util.ArrayList;

public class Universidade extends Instituicao { 
    private ArrayList<String> cursos;

    public Universidade(String nome, ArrayList<Pessoa> pessoas, ArrayList<String> cursos) {
        super(nome, pessoas);
        this.cursos = cursos;
    }

    public ArrayList<String> getCursos() {
        return cursos;
    }
    
    
}
