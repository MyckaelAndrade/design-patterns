import java.util.*;

public class PlataformaStreaming implements Subject {
    private Map<String, List<Usuario>> observersPorGenero = new HashMap<>();

    @Override
    public void inscrever(Usuario usuario, String genero) {
        genero = genero.toLowerCase();
        observersPorGenero.putIfAbsent(genero, new ArrayList<>());
        observersPorGenero.get(genero).add(usuario);
        usuario.inscreverGenero(genero);
    }

    @Override
    public void desinscrever(Usuario usuario, String genero) {
        genero = genero.toLowerCase();
        if (observersPorGenero.containsKey(genero)) {
            observersPorGenero.get(genero).remove(usuario);
            usuario.desinscreverGenero(genero);
        }
    }

    @Override
    public void notificar(String genero, String titulo) {
        genero = genero.toLowerCase();
        if (observersPorGenero.containsKey(genero)) {
            for (Usuario u : observersPorGenero.get(genero)) {
                u.update(genero, titulo);
            }
        }
    }

    public void adicionarFilme(String titulo, String genero) {
        System.out.println("\n🎬 Novo conteúdo adicionado: " + titulo + " [" + genero + "]");
        notificar(genero, titulo);
    }
}
