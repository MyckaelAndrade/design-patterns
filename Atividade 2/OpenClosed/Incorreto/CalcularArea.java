package OpenClosed.Incorreto;

public class CalcularArea {
    public double calcularArea(Object forma) {
        if (forma instanceof Circulo) {
            Circulo c = (Circulo) forma;
            return Math.PI * c.raio * c.raio;
        } else if (forma instanceof Retangulo) {
            Retangulo r = (Retangulo) forma;
            return r.largura * r.altura;
        }
        return 0;
    }
}
