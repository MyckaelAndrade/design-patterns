package core;

import auth.Autenticacao;
import bot.GeradorCaptcha;

public class Controller {
    private static Controller instance;
    private Autenticacao autenticacao;
    private GeradorCaptcha geradorCaptcha;

    public Controller(Autenticacao autenticacao, GeradorCaptcha geradorCaptcha) {
        this.autenticacao = autenticacao;
        this.geradorCaptcha = geradorCaptcha;
    }

    public static Controller getInstance(Autenticacao autenticacao, GeradorCaptcha geradorCaptcha) {    
        if (instance == null) {
            instance = new Controller(autenticacao, geradorCaptcha);
        }
        return instance;
    }

    public boolean login(String usuario, String senha, String captcha, String captchaGerado) {
        if (autenticacao.autenticar(usuario, senha)) { // Verifica se a autenticação foi bem-sucedida
            System.out.println("Autenticação bem-sucedida!");
            return true;
        }if (!geradorCaptcha.validarCaptcha(captchaGerado, captcha)) { // Verifica se o captcha é válido
            System.out.println("Captcha inválido!");
            return false;
        }else {
            System.out.println("Usuário ou Senha Incorretos!"); // Mensagem de falha na autenticação
            return false;
        }
    }

    public String gerarCaptcha() {
        return geradorCaptcha.gerarCaptcha(); // Gera um novo captcha
    }
}
