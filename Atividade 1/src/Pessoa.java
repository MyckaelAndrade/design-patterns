package src;
// Classe Abstrata
public abstract class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private String telefone;
    private String endereco;

    // Construtor
    public Pessoa(String nome, int idade, String cpf, String telefone, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    // Métodos Abstratos
    public abstract void exibirInformacoes();

    public abstract void validaDados();

    // Métodos Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
