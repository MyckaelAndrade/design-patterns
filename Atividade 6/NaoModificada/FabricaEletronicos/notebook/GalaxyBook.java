package Modificada.FabricaEletronicos.notebook;

public class GalaxyBook implements Notebook {
    // Atributos
    private String modelo;
    private String cor;
    private int bateria;

    // Construtor
    public GalaxyBook(String modelo, String cor, int bateria) {
        this.modelo = modelo;
        this.cor = cor;
        this.bateria = bateria;
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

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }
    
    // Métodos
    @Override
    public String toString() {
        return "GalaxyBook{" + "modelo='" + modelo + '\'' + ", cor='" + cor + '\'' + ", bateria=" + bateria + '}';
    }

    @Override
    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Bateria: " + bateria + " horas");
    }
}
