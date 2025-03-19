package DependencyInversion.Correcao;

public class Computador {
    private DispositivoEntrada teclado;
    private DispositivoEntrada mouse;

    // Construtor
    public Computador(DispositivoEntrada teclado, DispositivoEntrada mouse) {
        this.teclado = teclado;
        this.mouse = mouse;
    }

    // Método para iniciar o "computador"
    public void iniciar() {
        teclado.conectar();
        mouse.conectar();
        System.out.println("Computador ligado!");
    }

    // Métodos Getters e Setters
    public DispositivoEntrada getTeclado() {
        return teclado;
    }

    public void setTeclado(DispositivoEntrada teclado) {
        this.teclado = teclado;
    }

    public DispositivoEntrada getMouse() {
        return mouse;
    }

    public void setMouse(DispositivoEntrada mouse) {
        this.mouse = mouse;
    }
}
