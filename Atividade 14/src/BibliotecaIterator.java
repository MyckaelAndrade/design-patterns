import java.util.List;

public class BibliotecaIterator implements Iterator<Livro> {
    private List<Livro> livros;
    private int posicao = 0;

    public BibliotecaIterator(List<Livro> livros) {
        this.livros = livros;
    }

    @Override
    public boolean temProximo() {
        return posicao < livros.size();
    }

    @Override
    public Livro proximo() {
        return livros.get(posicao++);
    }
}
