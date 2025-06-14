package Codigo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // CRIANDO AS EQUIPES E SEUS MEMBROS
        Equipes equipes = Equipes.getInstance();
        Equipe equipeAlpha = new Equipe("Equipe 1");
        for (int i = 1; i <= 5; i++) {
            equipeAlpha.adicionarMembro(new Estudante("Aluno " + i));
        }
        equipes.adicionarEquipe(equipeAlpha);

        Equipe equipeBeta = new Equipe("Equipe 2");
        for (int i = 6; i <= 10; i++) {
            equipeBeta.adicionarMembro(new Estudante("Aluno " + i));
        }
        equipes.adicionarEquipe(equipeBeta);

        // CRIANDOS OS PROJETOS E ORIENTADORES
        Profissional orientador1 = new Profissional("Profissional 1", 5000);
        Projeto projeto1 = new Projeto("Projeto 1", orientador1, equipeAlpha);
        equipeAlpha.setProjeto(projeto1);

        Profissional orientador2 = new Profissional("Profissional 2", 5000);
        Projeto projeto2 = new Projeto("Projeto 2", orientador2, equipeBeta);
        equipeBeta.setProjeto(projeto2);

        // CRIANDO AS BANCAS DE JURADOS
        Banca bancaLambida = new Banca(projeto1);
        for (int i = 1; i <= 4; i++) {
            bancaLambida.adicionarJurado(new Jurado("Jurado " + i, 7 + i));
        }

        Banca bancaDelta = new Banca(projeto2);
        for (int i = 1; i <= 4; i++) {
            bancaDelta.adicionarJurado(new Jurado("Jurado " + i, 6 + i));
        }

        // ESTOU CALCULANDO AS NOTAS FINAIS DOS PROJETOS
        bancaLambida.calcularNotaFinal();
        bancaDelta.calcularNotaFinal();

        // ADICIONAR APRESENTAÇÕES 
        Sala sala1 = new Sala("Sala 1");
        Apresentacao apresentacao1 = new Apresentacao(projeto1, bancaLambida, sala1, LocalDateTime.now());
        Apresentacoes apresentacoes = Apresentacoes.getInstance();
        apresentacoes.adicionarApresentacao(apresentacao1);

        Sala sala2 = new Sala("Sala 2");
        Apresentacao apresentacao2 = new Apresentacao(projeto2, bancaDelta, sala2, LocalDateTime.now());
        apresentacoes.adicionarApresentacao(apresentacao2);

        // LISTAGEM DOS PROJETOS COM NOTA SUPERIOR OU IGUAL A 7
        List<Projeto> projetosAprovados = equipes.getEquipe().stream()
                .map(Equipe::getProjeto)
                .filter(p -> p.getNotaFinal() >= 7)
                .collect(Collectors.toList());

        // MOSTRANDO OS RESULTADOS DOS PROJETOS
        for (Projeto projeto : projetosAprovados) {
            System.out.println("Projeto aprovado: " + projeto.getNome() + " - Nota final: " + projeto.getNotaFinal());
        }
    }
}
