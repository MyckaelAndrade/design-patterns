package LiskovSubstitution.Incorreto;

public class Main {
    public static void main(String[] args) {
        Gaviao gaviao = new Gaviao();
        gaviao.voar();

        Pinguim pinguim = new Pinguim();
        pinguim.voar();
    }
}
