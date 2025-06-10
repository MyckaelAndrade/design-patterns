package NaoModificada.FabricaEletronicos;

public class Main {
    public static void main(String[] args) {
        // Criação de objetos
        Modificada.FabricaEletronicos.celular.Iphone iphone = new Modificada.FabricaEletronicos.celular.Iphone("Iphone 13", "Prata", 5000.00);
        Modificada.FabricaEletronicos.celular.Galaxy galaxy = new Modificada.FabricaEletronicos.celular.Galaxy("Galaxy S21", "Preto", 3000.00);

        Modificada.FabricaEletronicos.notebook.MacBook macbook = new Modificada.FabricaEletronicos.notebook.MacBook("MacBook Pro", "Prata", 15000.00);
        Modificada.FabricaEletronicos.notebook.GalaxyBook galaxyBook = new Modificada.FabricaEletronicos.notebook.GalaxyBook("Galaxy Book Pro", "Cinza", 7000);

        Modificada.FabricaEletronicos.factory.Apple appleFactory = new Modificada.FabricaEletronicos.factory.Apple();
        Modificada.FabricaEletronicos.factory.Samsung samsungFactory = new Modificada.FabricaEletronicos.factory.Samsung();

        // Exibição de informações
        System.out.println("\n =========================== \n");

        System.out.println("Celulares:");
        iphone.exibirInfo();
        galaxy.exibirInfo();

        System.out.println("\nFábrica Apple:");
        appleFactory.criarCelular().exibirInfo();

        System.out.println("\nFábrica Samsung:");
        samsungFactory.criarCelular().exibirInfo();

        System.out.println("\n =========================== \n");

        System.out.println("\nNotebooks:");
        macbook.exibirInfo();
        galaxyBook.exibirInfo();

        System.out.println("\nFábrica Apple:");
        appleFactory.criarNotebook().exibirInfo();

        System.out.println("\nFábrica Samsung:");
        samsungFactory.criarNotebook().exibirInfo();

        System.out.println("\n ============================ \n");

    }
}

