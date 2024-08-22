import DAO.AutorDAO;
import DAO.LivroDAO;
import DAO.SetupDatabase;
import Entidades.Autor;
import Entidades.Livro;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SetupDatabase.setupTables();

        AutorDAO autorDAO = new AutorDAO();
        LivroDAO livroDAO = new LivroDAO();

        // Inserir um autor
        Autor autor = new Autor();
        autor.setNome("J.K. Rowling");
        autor.setNacionalidade("Britânica");
        autorDAO.inserir(autor);

        // Inserir um livro
        Livro livro = new Livro();
        livro.setTitulo("Harry Potter e a Pedra Filosofal");
        livro.setAnoPublicacao(1997);
        livro.setIdAutor(1);
        livroDAO.inserir(livro);

        // Atualizar autor
        /*Autor atualizarAutor = new Autor();
        atualizarAutor.setNome("Jorge");
        atualizarAutor.setNacionalidade("Não sei");
        atualizarAutor.setId(2);
        autorDAO.atualizar(atualizarAutor);*/

        // Atualiazar livro
        /*Livro atualizarLivro = new Livro();
        atualizarLivro.setTitulo("Livro livrado");
        atualizarLivro.setAnoPublicacao(1996);
        atualizarLivro.setIdAutor(2);
        atualizarLivro.setId(1);
        livroDAO.atualizar(atualizarLivro);*/


        // Excluir autores
        /*autorDAO.excluir(3);*/

        //Excluir livro
        /*livroDAO.excluir(3);*/

        // Listar todos os autores
        List<Autor> autores = autorDAO.listar();
        autores.forEach(System.out::println);

        // Listar todos os livros
        List<Livro> livros = livroDAO.listar();
        livros.forEach(System.out::println);

        // Listar livros por autor
        List<Livro> livrosPorAutor = livroDAO.listarPorAutor(1);
        livrosPorAutor.forEach(System.out::println);
    }
}