public class VooSistema {
    public double reservarAssento(String poltrona) {
        int fileira = Integer.parseInt(poltrona.substring(0, poltrona.length() - 1));
        char letra = poltrona.charAt(poltrona.length() - 1);
        double valorBase = 500.0;

        if (fileira >= 1 && fileira <= 3) {
            return valorBase * 2.5 * 1.5;
        } else if (fileira >= 4 && fileira <= 8) {
            return valorBase * 2.5;
        } else {
            return valorBase;
        }
    }
}