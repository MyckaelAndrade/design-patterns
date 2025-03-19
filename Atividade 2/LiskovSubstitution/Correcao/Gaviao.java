package LiskovSubstitution.Correcao;
// Implementação do Gavião (que pode voar)
public class Gaviao implements PassaroQueVoa{
    // Métodos implementados
    @Override
    public void emitirSom(){
        System.out.println("KYYYAAAH!");
    }
    @Override
    public void voar(){
        System.out.println("Voar!");
    }
}
