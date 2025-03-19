package DependencyInversion.Correcao;

public class Main {
    public static void main(String[] args) {
        DispositivoEntrada teclado = new Teclado();
        DispositivoEntrada mouse = new Mouse();

        Computador pc = new Computador(teclado, mouse);
        pc.iniciar();
    }
}
