package DependencyInversion.Incorreto;
// Classe Computador depende diretamente das implementações concretas (violação do DIP)
public class Computador {
    private Teclado teclado;
    private Mouse mouse;

    // Construtor
    public Computador(Teclado teclado, Mouse mouse) {
        this.teclado = teclado; // Depende diretamente da implementação concreta
        this.mouse = mouse; // Depende diretamente da implementação concreta
    }

    // Método para iniciar o "computador"
    public void iniciar() {
        teclado.conectar();
        mouse.conectar();
        System.out.println("Computador ligado!");
    }

    // Métodos Getters e Setters
    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
}
