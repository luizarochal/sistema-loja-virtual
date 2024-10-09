package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import domain.Autor;
import domain.Avaliacao;
import domain.Cliente;
import domain.Livro;

public class AvaliacaoTest {

    private Livro livro;
    private Cliente cliente;
    private Avaliacao avaliacao;

    @Before
    public void setUp() {
        Autor autor = new Autor("J.R.R. Tolkien");
        livro = new Livro("O Senhor dos Anéis", autor, 1000, 100.0);
        cliente = new Cliente("Ana");

        avaliacao = new Avaliacao(cliente, livro, 5, "Excelente!");
    }

    @Test
    public void testeNotaMaxima() {
        assertEquals(5, avaliacao.getNota());
    }

    @Test
    public void testeAvaliacaoExcedeMaximo() {
        Avaliacao avaliacaoInvalida = new Avaliacao(cliente, livro, 7, "Nota acima do máximo!");
        assertEquals(5, avaliacaoInvalida.getNota());
    }
}

