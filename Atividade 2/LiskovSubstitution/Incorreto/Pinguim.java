package LiskovSubstitution.Incorreto;

public class Pinguim extends Passaro{
    @Override
    public void voar() {
        throw new UnsupportedOperationException("Pinguins não podem voar!");
    }
}
