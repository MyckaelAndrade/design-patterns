public class FabricaUmbro extends FabricaEsportiva {
    // Atributos
    public FabricaUmbro() {
        super("Umbro", "Reino Unido", 1924);
    }

    // Métodos
    @Override
    public CamisaEsportiva criarCamisa() {
        return new CamisaFluminense();
    }
}
