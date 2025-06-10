package Modificada.FabricaEletronicos.celular;

public class Galaxy implements Celular {
    // Atributos
    private String modelo;
    private String cor;
    private double preco;

    // Construtor
    public Galaxy(String modelo, String cor, double preco) {
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
    }

    // Métodos
    @Override
    public String toString() {
        return "Galaxy{" + "modelo='" + modelo + '\'' + ", cor='" + cor + '\'' + ", preco=" + preco +'}';
    }
    
    @Override
    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Preço: " + preco);
    }
}
