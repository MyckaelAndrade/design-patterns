package DependencyInversion.Correcao;

public class Teclado implements DispositivoEntrada{
    @Override
    public void conectar() {
        System.out.println("Teclado conectado!");
    }
}
