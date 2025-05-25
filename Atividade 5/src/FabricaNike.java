public class FabricaNike extends FabricaEsportiva {
    // Atributos
    public FabricaNike() {
        super("Nike", "Estados Unidos", 1964);
    }

    // Métodos
    @Override
    public CamisaEsportiva criarCamisa() {
        return new CamisaBrasil();
    }
}
