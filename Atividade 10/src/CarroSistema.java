public class CarroSistema {
    public double reservarCarro(String tipo) {
        double valorBase = 150.0;
        switch (tipo.toLowerCase()) {
            case "executivo":
                return valorBase * 2.0;
            case "luxo":
                return valorBase * 4.0;
            default:
                return valorBase;
        }
    }
}