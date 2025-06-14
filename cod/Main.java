package cod;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Criando Instituições
        Universidade puc = new Universidade("PUC Minas", 3000.0);
        Empresa google = new Empresa("Google", "12.345.678/0001-99");

        // Criando Equipes e Estudantes
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

        // Criando Projetos com Orientadores
        Profissional orientador1 = new Profissional("Profissional 1", "111.111.111-11", LocalDate.of(1980, 5, 10), 5000.0);
        Projeto projeto1 = new Projeto("Projeto 1", orientador1, equipeAlpha);
        equipeAlpha.setProjeto(projeto1);

        Profissional orientador2 = new Profissional("Profissional 2", "222.222.222-22", LocalDate.of(1980, 5, 10), 5000.0);
        Projeto projeto2 = new Projeto("Projeto 2", orientador2, equipeBeta);
        equipeBeta.setProjeto(projeto2);

        // Criando Bancas com Jurados e notas válidas
        Banca bancaLambida = new Banca(projeto1);
        for (int i = 1; i <= 4; i++) {
            bancaLambida.adicionarJurado(new Jurado("Jurado " + i, "222.222.222-2" + i, LocalDate.of(1985, 3, 3), 4000.0, 8.0));
        }

        Banca bancaDelta = new Banca(projeto2);
        for (int i = 1; i <= 4; i++) {
            bancaDelta.adicionarJurado(new Jurado("Jurado " + i, "333.333.333-3" + i, LocalDate.of(1985, 3, 3), 4000.0, 6.0));
        }

        // Avaliação
        bancaLambida.calcularNotaFinal();
        bancaDelta.calcularNotaFinal();

        // Apresentações
        Sala sala1 = new Sala("Sala 1");
        Apresentacao apresentacao1 = new Apresentacao(projeto1, bancaLambida, sala1, LocalDate.now());
        Apresentacoes.getInstance().adicionarApresentacao(apresentacao1);

        Sala sala2 = new Sala("Sala 2");
        Apresentacao apresentacao2 = new Apresentacao(projeto2, bancaDelta, sala2, LocalDate.now());
        Apresentacoes.getInstance().adicionarApresentacao(apresentacao2);

        // Filtro de projetos aprovados
        List<Projeto> projetosAprovados = equipes.getEquipe().stream()
                .map(Equipe::getProjeto)
                .filter(p -> p.getNotaFinal() >= 7)
                .collect(Collectors.toList());

        for (Projeto projeto : projetosAprovados) {
            System.out.println("Projeto aprovado: " + projeto.getNome() + " - Nota final: " + projeto.getNotaFinal());
        }
    }
}
s