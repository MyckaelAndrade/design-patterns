public class ViolaoSeteCordas implements ViolaoPrototype {
    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoSeteCordas();
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Violão 7 Cordas: Parecido com o clássico, mas com uma corda grave extra. Ideal para samba e choro.");
    }
}

