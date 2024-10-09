package domain;

import java.util.List;

public class Autor {
    public String nome;
    private List<Livro> livros;
    //no diagrama não da para ver se livro é private ou public, optei por private

    public Autor(String nome) {
        this.nome = nome;
    }

    public double direitosAutorais(Livro livro) {
        return livro.direitosAutorais();
    }
}

