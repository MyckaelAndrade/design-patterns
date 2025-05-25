public class FabricaAdidas extends FabricaEsportiva {
    // Atributos
    public FabricaAdidas() {
        super("Adidas", "Alemanha", 1949);
    }

    // Métodos
    @Override
    public CamisaEsportiva criarCamisa() {
        return new CamisaFlamengo();
    }
}
