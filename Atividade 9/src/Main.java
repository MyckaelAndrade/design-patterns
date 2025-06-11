import java.util.*;

public class Main {

    private static final Map<String, Integer> niveis = new HashMap<>();

    static {
        niveis.put("bronze", 3);
        niveis.put("prata", 5);
        niveis.put("ouro", 7);
        niveis.put("platina", 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nível do cliente (bronze, prata, ouro, platina): ");
        String nivel = scanner.nextLine().toLowerCase();

        if (!niveis.containsKey(nivel)) {
            System.out.println("Nível inválido. Tente novamente.");
            return;
        }

        int capacidade = niveis.get(nivel);
        Caixa caixa = new Caixa(capacidade);
        caixa.montarCaixa();

        System.out.println("\nItens na caixa (" + nivel.toUpperCase() + "):");
        Map<String, Integer> contagem = new LinkedHashMap<>();
        for (Item item : caixa.getItens()) {
            contagem.put(item.getNome(), contagem.getOrDefault(item.getNome(), 0) + 1);
        }

        for (Map.Entry<String, Integer> entrada : contagem.entrySet()) {
            System.out.println("- " + entrada.getKey() + " x" + entrada.getValue());
        }

        System.out.printf("\nValor total da caixa: R$ %.2f\n", caixa.calcularValorTotal());
    }
}
