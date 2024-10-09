package domain;

import java.util.List;

public class Cliente {
    public String nome;
    private List<Avaliacao> avaliacoes;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void avaliar(Livro livro, int nota, String comentario) {
        Avaliacao avaliacao = new Avaliacao(this, livro, nota, comentario);
        avaliacoes.add(avaliacao);
    }
    
}
