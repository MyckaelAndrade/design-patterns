import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public Iterator<Livro> criarIterator() {
        return new BibliotecaIterator(livros);
    }
}
