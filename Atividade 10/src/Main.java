public class Main {
    public static void main(String[] args) {
        Cliente[] clientes = {
                new Cliente("João da Silva", "123.456.789-00"),
                new Cliente("Maria Oliveira", "987.654.321-11")
        };

        PacoteFacade pacote = new PacoteFacade();
        pacote.comprarPacote(clientes, "5C", "Executivo", "Luxo", "credito", 4);
    }
}