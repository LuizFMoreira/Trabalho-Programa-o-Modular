package cod;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Universidade puc = new Universidade("PUC Minas", 3000.0);
        Empresa google = new Empresa("Google", "12.345.678/0001-99");

        Equipes equipes = Equipes.getInstance();
        Equipe equipeAlpha = new Equipe("Equipe 1");
        for (int i = 1; i <= 5; i++) {
            Estudante estudante = new Estudante("MAT00" + i, "Aluno " + i, "000.000.000-0" + i, LocalDate.of(2000, 1, 1));
            equipeAlpha.adicionarMembro(estudante);
        }
        equipes.adicionarEquipe(equipeAlpha);

        Equipe equipeBeta = new Equipe("Equipe 2");
        for (int i = 6; i <= 10; i++) {
            Estudante estudante = new Estudante("MAT00" + i, "Aluno " + i, "000.000.000-0" + i, LocalDate.of(2000, 1, 1));
            equipeBeta.adicionarMembro(estudante);
        }
        equipes.adicionarEquipe(equipeBeta);

        Profissional orientador1 = new Profissional("Profissional 1", "111.111.111-11", LocalDate.of(1980, 5, 10), 5000.0);
        Projeto projeto1 = new Projeto("Projeto 1", orientador1, equipeAlpha);
        equipeAlpha.setProjeto(projeto1);

        Profissional orientador2 = new Profissional("Profissional 2", "222.222.222-22", LocalDate.of(1980, 5, 10), 5000.0);
        Projeto projeto2 = new Projeto("Projeto 2", orientador2, equipeBeta);
        equipeBeta.setProjeto(projeto2);

        Banca bancaLambida = new Banca(projeto1);
        for (int i = 1; i <= 4; i++) {
            bancaLambida.adicionarJurado(new Jurado("Jurado " + i, "222.222.222-2" + i, LocalDate.of(1985, 3, 3), 4000.0, 8.0));
        }

        Banca bancaDelta = new Banca(projeto2);
        for (int i = 1; i <= 4; i++) {
            bancaDelta.adicionarJurado(new Jurado("Jurado " + i, "333.333.333-3" + i, LocalDate.of(1985, 3, 3), 4000.0, 6.0));
        }

        bancaLambida.calcularNotaFinal();
        bancaDelta.calcularNotaFinal();

        // Criando duas salas
        Sala sala1 = new Sala("Sala 1");
        Sala sala2 = new Sala("Sala 2");

        // Criando duas apresentações
        Apresentacao apresentacao1 = new Apresentacao(projeto1, bancaLambida, sala1, LocalDate.of(2025, 6, 15));
        Apresentacao apresentacao2 = new Apresentacao(projeto2, bancaDelta, sala2, LocalDate.of(2025, 6, 16));

        // Adicionando as apresentações ao singleton
        Apresentacoes apresentacoes = Apresentacoes.getInstance();
        apresentacoes.adicionarApresentacao(apresentacao1);
        apresentacoes.adicionarApresentacao(apresentacao2);

        // Mostrando os projetos aprovados (nota >= 7)
        List<Projeto> projetosAprovados = equipes.getEquipe().stream()
                .map(Equipe::getProjeto)
                .filter(p -> p.getNotaFinal() >= 7)
                .collect(Collectors.toList());

        System.out.println("\nProjetos aprovados:");
        for (Projeto projeto : projetosAprovados) {
            System.out.println("- " + projeto.getNome() + " (Nota: " + projeto.getNotaFinal() + ")");
        }

        // Mostrando as apresentações cadastradas
        System.out.println("\nApresentações cadastradas:");
        for (Apresentacao ap : apresentacoes.getApresentacao()) {
            System.out.println("- Projeto: " + ap.getProjeto().getNome());
            System.out.println("  Sala: " + ap.getLocal().getNome());
            System.out.println("  Data: " + ap.getDataHora());
        }
    }
}
