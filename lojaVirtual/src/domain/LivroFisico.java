package domain;

public class LivroFisico implements IProduto {
    private static final double ADIC_PAGINA = 0.03;
    private double valorEncadernacao;

    public LivroFisico(double valorEncadernacao) {
        this.valorEncadernacao = valorEncadernacao;
    }

    @Override
    public double precoVenda(Livro livro) {
        return livro.getPrecoBase() + (livro.getPaginas() * ADIC_PAGINA) + valorEncadernacao;
    }
    
}
