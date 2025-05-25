public class FabricaKappa extends FabricaEsportiva {
    // Atributos
    public FabricaKappa() {
        super("Kappa", "Itália", 1916);
    }

    // Métodos
    @Override
    public CamisaEsportiva criarCamisa() {
        return new CamisaVasco();
    }
}
