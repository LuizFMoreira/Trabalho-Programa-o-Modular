package Codigo;

import java.time.LocalDateTime;

public class Apresentacao {
    private Projeto projeto;
    private Banca banca;
    private Sala local;
    private LocalDateTime dataHora;

    public Apresentacao(Projeto projeto, Banca banca, Sala local, LocalDateTime dataHora) {
        this.projeto = projeto;
        this.banca = banca;
        this.local = local;
        this.dataHora = dataHora;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public Banca getBanca() {
        return banca;
    }

    public Sala getLocal() {
        return local;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    @Override
    public double calcularNota() {
        this.notaFinal = banca.calcularNotaFinal();
        return notaFinal;
    }

    @Override
    public String gerarFeedback() {
        this.feedback = "Apresentação do projeto " + projeto.getNome() + 
                       " obteve nota " + notaFinal;
        return feedback;
    }

    public void avaliar(Jurado jurado, double nota) {
        banca.getNotasJurados().put(jurado, nota);
        calcularNota();
        gerarFeedback();
    }
    
}