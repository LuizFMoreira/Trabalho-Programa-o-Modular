package Codigo;

import java.util.ArrayList;
import java.util.List;

public class Banca {
    private Projeto projetoAvaliado;
    private List<Jurado> jurados;

    public Banca(Projeto projetoAvaliado) {
        this.projetoAvaliado = projetoAvaliado;
        this.jurados = new ArrayList<>();
    }

    // Adiciona jurado à banca
    public void adicionarJurado(Jurado jurado) {
        jurados.add(jurado);
    }

    // Calcula a nota final do projeto com base na média das notas dos jurados
    public void calcularNotaFinal() {
        double totalNota = 0;
        for (Jurado j : jurados) {
            totalNota += j.getNota();
        }
        double notaFinal = totalNota / jurados.size();
        projetoAvaliado.setNotaFinal((int) notaFinal);
    }

    public void gerarFeedback() {
        // Lógica para gerar feedback para o projeto
        System.out.println("Feedback gerado para o projeto " + projetoAvaliado.getNome());
    }
}
