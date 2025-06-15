
/**
 * 📚 Projeto: Biblioteca com Padrão Iterator
 *
 * Esse projeto simula uma biblioteca com vários livros.
 * Usamos o padrão Iterator para percorrer os livros um a um,
 * sem precisar acessar diretamente a lista da biblioteca.
 *
 * Isso ajuda a proteger os dados e deixar o código mais organizado,
 * fácil de manter e com menos dependência entre as classes.
 */

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(new Livro("Dom Casmurro", "Machado de Assis"));
        biblioteca.adicionarLivro(new Livro("1984", "George Orwell"));
        biblioteca.adicionarLivro(new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry"));

        System.out.println("Lista de livros na biblioteca: \n");

        Iterator<Livro> iterator = biblioteca.criarIterator();
        while (iterator.temProximo()) {
            System.out.println(iterator.proximo());
        }
    }
}
