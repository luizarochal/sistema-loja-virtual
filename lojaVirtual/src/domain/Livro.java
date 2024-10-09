package domain;

import java.util.List;

public class Livro {
    private static final double PCT_DIREITOS = 0.08;
    private String titulo;
    private Autor autor;
    private List<IProduto> modalidades;
    private int paginas;
    private double precoBase;
    private List<Avaliacao> avaliacoes;

    public Livro(String titulo, Autor autor, int paginas, double precoBase) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.precoBase = precoBase;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public int getPaginas() {
        return paginas;
    }

    public double direitosAutorais() {
        return precoBase * PCT_DIREITOS;
    }

    public double avaliacaoMedia() {
        double media = 0;
        for (Avaliacao avaliacao : avaliacoes) {
            media += avaliacao.getNota();
        }
        return media / avaliacoes.size();
    }
    
}
