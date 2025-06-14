package cod;
public class Empresa extends Instituicao{
    protected String cnpj;
    protected String qntFuncionarios;
    
    public Empresa(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
}
