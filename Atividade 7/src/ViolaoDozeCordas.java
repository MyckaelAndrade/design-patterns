public class ViolaoDozeCordas implements ViolaoPrototype {
    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoDozeCordas();
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Violão 12 Cordas: Cordas agrupadas em pares, som mais cheio e ressonante.");
    }
}
