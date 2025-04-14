package bot;

public interface GeradorCaptcha {
    public String gerarCaptcha(); // Método para gerar o captcha
    public boolean validarCaptcha(String original, String input); // Método para validar o captcha
}
