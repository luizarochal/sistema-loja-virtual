package main;

import domain.Autor;
import domain.Livro;
import domain.LivroDigital;
import domain.LivroFisico;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("J.K. Rowling");
        Livro livro = new Livro("Harry Potter", autor, 500, 50.0);
        
        LivroFisico livroFisico = new LivroFisico(15.0); // Encadernação/capa custa 15.0
        LivroDigital livroDigital = new LivroDigital();

        System.out.println("Preço Livro Físico: " + livroFisico.precoVenda(livro));
        System.out.println("Preço Livro Digital: " + livroDigital.precoVenda(livro));

        System.out.println("Direitos Autorais: " + autor.direitosAutorais(livro));
    }   
}
