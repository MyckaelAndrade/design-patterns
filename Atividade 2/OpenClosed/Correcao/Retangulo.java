package OpenClosed.Correcao;

public class Retangulo implements Forma {
    private double largura, altura;
    
    //Construtor
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    //método para calcular á área do Rentângulo
    @Override
    public double calcularArea() {
        return largura * altura;
    }

    //Getters e Setters
    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
