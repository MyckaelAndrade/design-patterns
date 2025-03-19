package InterfaceSegregation.Incorreto;

public class Main {
    public static void main(String[] args) {
        Trabalhador programador = new Programador();
        programador.trabalhar();
        programador.comer(); // Funciona

        Trabalhador robo = new Robo();
        robo.trabalhar();
        robo.comer(); // Vai lançar uma exceção! (Erro)
    }
}
