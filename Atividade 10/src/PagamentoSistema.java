public class PagamentoSistema {
    public double processarPagamento(double total, String forma, int parcelas) {
        switch (forma.toLowerCase()) {
            case "pix":
                return total * 0.90;
            case "boleto":
                return total * 0.95;
            case "credito":
                if (parcelas <= 1) return total;
                return total * Math.pow(1.0399, parcelas - 1);
            default: // débito ou outro
                return total;
        }
    }
}