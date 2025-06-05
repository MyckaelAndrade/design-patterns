public class Main {
    public static void main(String[] args) {
        PlataformaStreaming netflixClone = new PlataformaStreaming();

        Usuario u1 = new Usuario("Ana");
        Usuario u2 = new Usuario("Carlos");
        Usuario u3 = new Usuario("Beatriz");
        Usuario u4 = new Usuario("Diego");
        Usuario u5 = new Usuario("Elena");

        netflixClone.inscrever(u1, "Ação");
        netflixClone.inscrever(u2, "Comédia");
        netflixClone.inscrever(u3, "Terror");
        netflixClone.inscrever(u4, "Anime");
        netflixClone.inscrever(u5, "Ficção Científica");

        // Múltiplas inscrições
        netflixClone.inscrever(u1, "Terror");
        netflixClone.inscrever(u3, "Ação");
        netflixClone.inscrever(u5, "Ação");

        netflixClone.adicionarFilme("Matrix 5", "Ficção Científica");
        netflixClone.adicionarFilme("Invocação do Mal 4", "Terror");
        netflixClone.adicionarFilme("One Piece Live Action", "Anime");
        netflixClone.adicionarFilme("Bad Boys 4", "Ação");
        netflixClone.adicionarFilme("Se Beber Não Case 3", "Comédia");
    }
}
