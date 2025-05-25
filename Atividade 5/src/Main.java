// Exemplo de uso do padrão Factory Method
// Criação de uma fábrica de camisas esportivas

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Exibe as opções de times disponíveis
        System.out.println("Escolha um time: ");
        System.out.println("1 - Brasil (Nike)");
        System.out.println("2 - Flamengo (Adidas)");
        System.out.println("3 - Botafogo (Puma)");
        System.out.println("4 - Fluminense (Umbro)");
        System.out.println("5 - Vasco (Kappa)");
        System.out.print("Digite o número do time desejado: ");

        // Lê a opção do usuário
        int opcao = scanner.nextInt();
        FabricaEsportiva fabrica = null;

        // Cria a fábrica correspondente à opção escolhida
        // e cria a camisa esportiva
        switch (opcao) {
            case 1:
                fabrica = new FabricaNike();
                break;
            case 2:
                fabrica = new FabricaAdidas();
                break;
            case 3:
                fabrica = new FabricaPuma();
                break;
            case 4:
                fabrica = new FabricaUmbro();
                break;
            case 5:
                fabrica = new FabricaKappa();
                break;
            default:
                System.out.println("Opção inválida!");
                System.exit(0);
        }

        // Cria a camisa esportiva usando a fábrica escolhida
        CamisaEsportiva camisa = fabrica.criarCamisa();

        // Exibe os detalhes da camisa e da fábrica
        System.out.println("\nDados do Time:");
        camisa.exibirDetalhes();

        // Exibe os detalhes da camisa e da fábrica
        System.out.println("\nDados da Fábrica:");
        fabrica.exibirDadosFabrica();

    }
}
