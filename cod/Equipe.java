package cod;
import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private String nome;
    private List<Estudante> membros;
    private Projeto projeto;

    public Equipe(String nome) {
        this.nome = nome;
        this.membros = new ArrayList<>();
    }

    // Adiciona membro à equipe
    public void adicionarMembro(Estudante estudante) {
        membros.add(estudante);
    }

    public String getNome() {
        return nome;
    }

    public List<Estudante> getMembros() {
        return membros;
    }

    public Projeto   getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
}
