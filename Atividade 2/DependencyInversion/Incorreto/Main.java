package DependencyInversion.Incorreto;

public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador(null, null);
        pc.iniciar();
    }
}
