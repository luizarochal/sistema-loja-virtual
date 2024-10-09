package domain;

public class Avaliacao {
    public static final int MAX_AVAL = 5;
    private Cliente cliente;
    private Livro livro;
    private int nota;
    private String comentario;

    public Avaliacao(Cliente cliente, Livro livro, int nota, String comentario) {
        this.cliente = cliente;
        this.livro = livro;
        this.nota = Math.min(nota, MAX_AVAL);
        this.comentario = comentario;
    }

    public int getNota() {
        return nota;
    }
}
