package InterfaceSegregation.Incorreto;

public class Robo implements Trabalhador{
    // Métodos implementados
    @Override
    public void trabalhar() {
        System.out.println("O robô trabalha!");
    }

    @Override
    public void comer() {
        throw new UnsupportedOperationException("Robôs não comem!"); // Gera um Erro!
    }
}
