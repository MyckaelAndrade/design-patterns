public abstract class FabricaEsportiva {
    // Atributos
    private String nome;
    private String pais;
    private int fundacao;

    // Construtor
    public FabricaEsportiva(String nome, String pais, int fundacao) {
        this.nome = nome;
        this.pais = pais;
        this.fundacao = fundacao;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getFundacao() {
        return fundacao;
    }

    public void setFundacao(int fundacao) {
        this.fundacao = fundacao;
    }

    // Método abstrato para criar camisa esportiva
    public abstract CamisaEsportiva criarCamisa();

    // Método para exibir dados da fábrica
    public void exibirDadosFabrica() {
        System.out.println("Fábrica: " + nome);
        System.out.println("País: " + pais);
        System.out.println("Fundação: " + fundacao);
    }
}
