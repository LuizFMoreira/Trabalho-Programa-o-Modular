package Codigo;

import java.util.Map;

public class Banca {
    private Projeto ProjetoAvaliado;
     private Map<Jurado, Integer> jurados;

     public Banca(Projeto projetoAvaliado, Map<Jurado, Integer> jurados) {
        ProjetoAvaliado = projetoAvaliado;
        this.jurados = jurados;
    }
    
    public Projeto getProjetoAvaliado() {
        return ProjetoAvaliado;
    }

    public Map<Jurado, Integer> getJurados() {
         return jurados;
     }
    
     public void CalcularNotaFinal() {
        
    }
}
