public class HotelSistema {
    public double reservarQuarto(String tipo, int quantidadePessoas) {
        double valorBase = 200.0;
        switch (tipo.toLowerCase()) {
            case "executivo":
                return valorBase * 1.5 * quantidadePessoas;
            case "suite":
                return valorBase * 1.5 * 3.0 * quantidadePessoas;
            default:
                return valorBase * quantidadePessoas;
        }
    }
}