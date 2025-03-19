package InterfaceSegregation.Correcao;

public class Programador implements Trabalhador, Alimentavel{
    // Métodos implementados
    @Override
    public void trabalhar() {
        System.out.println("O programador trabalhar!");
    }

    @Override
    public void comer() {
        System.out.println("O programador está almoçando!");
    }
}
