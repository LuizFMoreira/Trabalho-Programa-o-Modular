package cod;
import java.time.LocalDate;

public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected LocalDate dataNascimento;
    protected Instituicao instituicao;
    
    public Pessoa(String nome, String cpf, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Instituicao getInstituicao(){
        return instituicao;
    }
    
}
