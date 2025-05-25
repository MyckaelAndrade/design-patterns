public class FabricaPuma extends FabricaEsportiva {
    // Atributos
    public FabricaPuma() {
        super("Puma", "Alemanha", 1948);
    }

    // Métodos
    @Override
    public CamisaEsportiva criarCamisa() {
        return new CamisaBotafogo();
    }
}
