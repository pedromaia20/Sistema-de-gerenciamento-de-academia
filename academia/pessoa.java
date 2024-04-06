package academia;
public class pessoa {
    private String nome;
    private String cidade;
    private String rua;
    private int cpf;
    private int cep;
    
    public pessoa(String nome, String cidade, String rua, int cpf, int cep) {
        this.nome = nome;
        this.cidade = cidade;
        this.rua = rua;
        this.cpf = cpf;
        this.cep = cep;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }
    
}