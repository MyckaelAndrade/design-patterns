package LiskovSubstitution.Correcao;

public class Main {
    public static void main(String[] args) {
        Pinguim pinguim = new Pinguim();
        System.out.println("====================================");
        System.out.println("O pinguim não para de fazer ");
        pinguim.emitirSom();

        Gaviao gaviao = new Gaviao();
        System.out.println("====================================");
        System.out.println("O Gavião está fazendo ");
        gaviao.emitirSom();
        System.out.println("Ele começou a ");
        gaviao.voar();
        System.out.println("====================================");
    }
}
