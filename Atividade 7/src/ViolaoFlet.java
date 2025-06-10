public class ViolaoFlet implements ViolaoPrototype {
    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoFlet();
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Violão Flet: Caixa acústica fina, cordas de nylon, timbre suave, elétrico.");
    }
}
