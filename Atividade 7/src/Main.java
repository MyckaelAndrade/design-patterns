public class Main {
    public static void main(String[] args) {
        System.out.println("🎼 Bem-vindo à Fábrica de Violões 🎼\n");

        ViolaoPrototype v1 = FabricaViolaoPrototype.getViolao("classico");
        ViolaoPrototype v2 = FabricaViolaoPrototype.getViolao("flet");
        ViolaoPrototype v3 = FabricaViolaoPrototype.getViolao("12cordas");
        ViolaoPrototype v4 = FabricaViolaoPrototype.getViolao("00");

        if (v1 != null) v1.exibirInformacoes();
        if (v2 != null) v2.exibirInformacoes();
        if (v3 != null) v3.exibirInformacoes();
        if (v4 != null) v4.exibirInformacoes();
    }
}
