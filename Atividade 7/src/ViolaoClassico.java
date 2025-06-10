public class ViolaoClassico implements ViolaoPrototype {
    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoClassico();
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Violão Clássico: Acústico, 6 cordas de nylon, leve e macio, ótimo para iniciantes.");
    }
}
