public class ViolaoFolk implements ViolaoPrototype {
    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoFolk();
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Violão Folk: Corpo maior, cordas de aço, ideal para pop e rock, som encorpado.");
    }
}
