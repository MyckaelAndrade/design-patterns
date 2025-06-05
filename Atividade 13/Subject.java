public interface Subject {
    void inscrever(Usuario usuario, String genero);
    void desinscrever(Usuario usuario, String genero);
    void notificar(String genero, String titulo);
}