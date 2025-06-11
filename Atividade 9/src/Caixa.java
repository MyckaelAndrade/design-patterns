import java.util.*;

public class Caixa {
    private static final List<Item> catalogo = new ArrayList<>();

    static {
        catalogo.add(new Item("Quadrinho", 15.00));
        catalogo.add(new Item("Chaveiro", 5.00));
        catalogo.add(new Item("Busto", 10.00));
        catalogo.add(new Item("Adesivo", 1.00));
        catalogo.add(new Item("Pôster", 25.00));
        catalogo.add(new Item("Camiseta", 25.00));
        catalogo.add(new Item("Caneta", 3.00));
        catalogo.add(new Item("Miniatura", 20.00));
    }

    private List<Item> itens;
    private int capacidade;

    public Caixa(int capacidade) {
        this.capacidade = capacidade;
        this.itens = new ArrayList<>();
    }

    public void montarCaixa() {
        Random random = new Random();
        itens.clear();
        for (int i = 0; i < capacidade; i++) {
            Item itemAleatorio = catalogo.get(random.nextInt(catalogo.size()));
            itens.add(itemAleatorio);
        }
    }

    public List<Item> getItens() {
        return itens;
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        return total;
    }
}
