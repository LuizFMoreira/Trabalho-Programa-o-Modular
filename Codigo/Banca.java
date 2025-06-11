package Codigo;

import java.util.Map;

public class Banca implements Avaliavel {
    private Projeto projetoAvaliado;
    private Map<Jurado, Integer> jurados;
    private String feedback;

     public Banca(Projeto projetoAvaliado, Map<Jurado, Integer> jurados) {
        this.projetoAvaliado = projetoAvaliado;
        this.jurados = jurados;
    }
    
    public Projeto getProjetoAvaliado() {
        return projetoAvaliado;
    }

    public Map<Jurado, Integer> getJurados() {
         return jurados;
     }
     
     public void addJurado(Jurado j){
        jurados.put(j,j.getId());
     }

     public double calcularNota(){
        int soma=0;
        int cn=0;
        for (Map.Entry<Jurado, Integer> m : jurados.entrySet()) {
            int nota = m.getValue();
            soma+= nota;
            cn++;
        }
        return soma/cn;
    }
    public String gerarFeedback() {
        this.feedback = "Apresentação do projeto: " + projetoAvaliado.getNome() + 
                       " obteve nota " + calcularNota();
        return feedback;
    }  
}
