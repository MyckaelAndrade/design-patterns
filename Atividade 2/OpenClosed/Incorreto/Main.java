package OpenClosed.Incorreto;

public class Main {
    public static void main(String[] args) {
        CalcularArea calcular = new CalcularArea();
        Circulo circulo = new Circulo(5);
        Retangulo retangulo = new Retangulo(5,3);

        System.out.printf("Área do circulo: " + calcular.calcularArea(circulo));
        System.out.println("Área do Retangulo: " + calcular.calcularArea(retangulo));
    }
}
