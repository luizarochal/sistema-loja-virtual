package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import domain.Autor;
import domain.Livro;
import domain.LivroDigital;
import domain.LivroFisico;

public class LivroTest {
    
    private Livro livro;
    private Autor autor;
    private LivroFisico livroFisico;
    private LivroDigital livroDigital;

    @Before
    public void setUp() {
        autor = new Autor("J.K. Rowling");
        livro = new Livro("Harry Potter", autor, 500, 50.0);
        livroFisico = new LivroFisico(15.0); 
        livroDigital = new LivroDigital();
    }

    @Test
    public void testePrecoVendaLivroFisico() {
        double precoEsperado = 50.0 + (500 * 0.03) + 15.0;
        assertEquals(precoEsperado, livroFisico.precoVenda(livro), 0.01);
    }

    @Test
    public void testePrecoVendaLivroDigital() {
        double precoEsperado = 50.0;
        assertEquals(precoEsperado, livroDigital.precoVenda(livro), 0.01);

    } 
}
