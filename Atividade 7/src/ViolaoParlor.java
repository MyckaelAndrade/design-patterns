public class ViolaoParlor implements ViolaoPrototype {
    private String tipo;

    public ViolaoParlor(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoParlor(this.tipo);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Violão " + tipo + ": Tipo Parlor com estrutura menor, ideal para uso casual e fingerstyle.");
    }
}