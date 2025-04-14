import java.util.Scanner;
import bot.GerarCaptcha;
import core.Controller;
import auth.ServicoAutenticacao;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ServicoAutenticacao autenticacao = new ServicoAutenticacao(); // Instância do serviço de autenticação
        GerarCaptcha geradorCaptcha = new GerarCaptcha(); // Instância do gerador de captcha
        Controller controller = Controller.getInstance(autenticacao, geradorCaptcha); // Instância do controlador

        System.out.println("========================================= \n");
        System.out.println("Bem-vindo ao sistema de autenticação!");

        System.out.print("Digite seu usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        String captchaGerado = controller.gerarCaptcha();
        System.out.print("Código: " + captchaGerado);

        System.out.print("\nDigite o código para verificar que você não é um bot: ");
        String captcha = scanner.nextLine();

        controller.login(usuario, senha, captcha, captchaGerado); // Chama o método de login com os dados fornecidos pelo usuário
        scanner.close(); // Fecha o scanner para evitar vazamento de recursos
        System.out.println("Obrigado por usar o sistema de autenticação!"); 
        System.out.println("\n=========================================");
    }
}