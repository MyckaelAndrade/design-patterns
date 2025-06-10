import java.util.HashMap;
import java.util.Map;

public class FabricaViolaoPrototype {
    private static Map<String, ViolaoPrototype> violoes = new HashMap<>();

    static {
        violoes.put("classico", new ViolaoClassico());
        violoes.put("folk", new ViolaoFolk());
        violoes.put("flet", new ViolaoFlet());
        violoes.put("jumbo", new ViolaoJumbo());
        violoes.put("7cordas", new ViolaoSeteCordas());
        violoes.put("12cordas", new ViolaoDozeCordas());
        violoes.put("zero", new ViolaoParlor("Zero"));
        violoes.put("00", new ViolaoParlor("Duplo Zero"));
        violoes.put("000", new ViolaoParlor("Triplo Zero"));
    }

    public static ViolaoPrototype getViolao(String tipo) {
        ViolaoPrototype prototipo = violoes.get(tipo.toLowerCase());
        if (prototipo != null) {
            return prototipo.clonar();
        }
        System.out.println("Tipo de violão não encontrado!");
        return null;
    }
}