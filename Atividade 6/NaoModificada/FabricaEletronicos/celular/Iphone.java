package NaoModificada.FabricaEletronicos.celular;

public class Iphone implements Celular {
    // Atributos
    private String modelo;
    private String cor;
    private double preco;

    // Construtor
    public Iphone(String modelo, String cor, double preco) {
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
    }

    // Métodos
    @Override
    public String toString() {
        return "Iphone{" + "modelo='" + modelo + '\'' + ", cor='" + cor + '\'' + ", preco=" + preco +'}';
    }

    @Override
    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Preço: " + preco);
    }
}
