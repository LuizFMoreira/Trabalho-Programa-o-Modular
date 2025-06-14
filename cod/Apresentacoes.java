package cod;
import java.util.ArrayList;
import java.util.List;

public class Apresentacoes {
    private static Apresentacoes instance;
    private List<Apresentacao> apresentacao;

    private Apresentacoes() {
        apresentacao = new ArrayList<>();
    }

    public static Apresentacoes getInstance() {
        if (instance == null) {
            instance = new Apresentacoes();
        }
        return instance;
    }

    public void adicionarApresentacao(Apresentacao apresentacao) {
        this.apresentacao.add(apresentacao);
    }

    public List<Apresentacao> getApresentacao() {
        return apresentacao;
    }
}
