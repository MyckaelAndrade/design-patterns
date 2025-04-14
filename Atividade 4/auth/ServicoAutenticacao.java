package auth;

public class ServicoAutenticacao implements Autenticacao {
    private final String usuario = "admin";
    private final String senha = "1234";

    @Override
    public boolean autenticar(String usuario, String senha) {
        // Implementação da lógica de autenticação
        if(this.usuario.equals(usuario) && this.senha.equals(senha)) {
            return true; // Autenticação bem-sucedida
        } else {
            return false; // Autenticação falhou
        }
    }   
}
