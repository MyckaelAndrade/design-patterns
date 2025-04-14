package bot;

import java.util.Random; // Importa a classe Random para gerar números aleatórios

public class GerarCaptcha implements GeradorCaptcha {
    @Override
    public String gerarCaptcha() {
        String chars = "ABCD";
        StringBuilder captcha = new StringBuilder(); // Cria um StringBuilder para construir o captcha
        Random random = new Random(); // Cria uma instância de Random para gerar números aleatórios
        for (int i = 0; i < 4; i++) { // Loop para gerar 4 caracteres
            captcha.append(chars.charAt(random.nextInt(chars.length())));
        }
        return captcha.toString(); // Retorna o captcha gerado como uma string
    }

    @Override
    public boolean validarCaptcha(String original, String input) {
        return original.equals(input); // Compara o captcha original com o input do usuário
    }
}
