package cod;
import java.time.LocalDate;

public class Profissional extends Pessoa {
    private double salario;

    public Profissional(String nome, String cpf, LocalDate dataNascimento, double salario) {
        super(nome, cpf, dataNascimento);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}
