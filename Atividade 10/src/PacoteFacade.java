public class PacoteFacade {
    private VooSistema vooSistema;
    private HotelSistema hotelSistema;
    private CarroSistema carroSistema;
    private PagamentoSistema pagamentoSistema;

    public PacoteFacade() {
        vooSistema = new VooSistema();
        hotelSistema = new HotelSistema();
        carroSistema = new CarroSistema();
        pagamentoSistema = new PagamentoSistema();
    }

    public void comprarPacote(Cliente[] clientes, String poltrona, String tipoQuarto, String tipoCarro, String formaPagamento, int parcelas) {
        double valorVoo = vooSistema.reservarAssento(poltrona);
        double valorHotel = hotelSistema.reservarQuarto(tipoQuarto, clientes.length);
        double valorCarro = carroSistema.reservarCarro(tipoCarro);

        double total = valorVoo + valorHotel + valorCarro;
        double valorFinal = pagamentoSistema.processarPagamento(total, formaPagamento, parcelas);

        System.out.println("===== DADOS DA COMPRA =====");
        for (Cliente c : clientes) {
            System.out.println("Cliente: " + c.getNome() + " | CPF: " + c.getCpf());
        }
        System.out.println("Poltrona: " + poltrona);
        System.out.println("Quarto: " + tipoQuarto);
        System.out.println("Carro: " + tipoCarro);
        System.out.println("Forma de Pagamento: " + formaPagamento + (parcelas > 1 ? (" em " + parcelas + "x") : ""));
        System.out.println(String.format("Valor Total: R$ %.2f", total));
        System.out.println(String.format("Valor Final com desconto/juros: R$ %.2f", valorFinal));
    }
}