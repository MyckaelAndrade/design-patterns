public class ViolaoJumbo implements ViolaoPrototype {
    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoJumbo();
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Violão Jumbo: Corpo largo, som mais grave, comum com cordas de aço.");
    }
}
