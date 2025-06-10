package Modificada.FabricaEletronicos.notebook;

public class MacBook implements Notebook {
    // Atributos
    private String modelo;
    private String cor;
    private double preco;

    // Construtor
    public MacBook(String modelo, String cor, double preco) {
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Métodos
    @Override
    public String toString() {
        return "MacBook{" + "modelo='" + modelo + '\'' + ", cor='" + cor + '\'' + ", preco=" + preco +'}';
    }

    @Override
    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Preço: " + preco);
    }
    
}
