package InterfaceSegregation.Correcao;

public class Main {
    public static void main(String[] args) {
        Trabalhador programador = new Programador();
        Alimentavel humano = new Programador();
        programador.trabalhar();
        humano.comer(); // Funcionando correntamente

        Trabalhador robo = new Robo();
        robo.trabalhar(); // Funciona corretamente, sem aquela exceção (erro)
    }
}
