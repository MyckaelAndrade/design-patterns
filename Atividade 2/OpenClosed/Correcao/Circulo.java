package OpenClosed.Correcao;

public class Circulo implements Forma {
    private double raio;

    //Construtor
    public Circulo(double raio) {
        this.raio = raio;
    }

    //Método para calcular a área do círculo
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    //Getters e Setters
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
