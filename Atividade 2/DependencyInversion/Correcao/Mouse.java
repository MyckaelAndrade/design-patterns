package DependencyInversion.Correcao;

public class Mouse implements DispositivoEntrada {
    @Override
    public void conectar() {
        System.out.println("Mouse conectado!");
    }
}
