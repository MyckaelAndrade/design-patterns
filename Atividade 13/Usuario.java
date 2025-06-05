import java.util.HashSet;
import java.util.Set;

public class Usuario implements Observer {
    private String nome;
    private Set<String> generosInscritos = new HashSet<>();

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void inscreverGenero(String genero) {
        generosInscritos.add(genero.toLowerCase());
    }

    public void desinscreverGenero(String genero) {
        generosInscritos.remove(genero.toLowerCase());
    }

    public boolean estaInscrito(String genero) {
        return generosInscritos.contains(genero.toLowerCase());
    }

    @Override
    public void update(String genero, String titulo) {
        if (estaInscrito(genero)) {
            System.out.println("[" + nome + "] Novo conteúdo em " + genero + ": " + titulo);
        }
    }
}

