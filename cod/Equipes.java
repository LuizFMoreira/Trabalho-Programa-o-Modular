package cod;
import java.util.ArrayList;
import java.util.List;

public class Equipes {
    private static Equipes instance;
    private List<Equipe> equipe;

    private Equipes() {
        equipe = new ArrayList<>();
    }

    public static Equipes getInstance() {
        if (instance == null) {
            instance = new Equipes();
        }
        return instance;
    }

    public void adicionarEquipe(Equipe equipe) {
        this.equipe.add(equipe);
    }

    public List<Equipe> getEquipe() {
        return equipe;
    }
}
