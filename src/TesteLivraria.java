import br.com.livraria.produtos.Livros;
import br.com.livraria.externos.*;

public class TesteLivraria {

	public static void main(String[] args) {
		
		Autor autor1 = new Autor("123.456.789-11");
		autor1.setNome("Ana");
		autor1.setEmail("ana.ana@gmail.com");
		
		Editora editora1 = new Editora("SARAIVA S.A","51.342.213/1234-55");
		editora1.setNomeFantasia("Saraiva");
		
		System.out.println("----------- INFORMAÇÕES LIVRO -------------");
		Livros livro1 =  new Livros("123-45-6789-123-4", autor1, editora1);
		livro1.setTitulo("ABCD");
		livro1.setDescricao("Efghijklmn");
		livro1.setValor(118.40);
		livro1.aplicarDescontoDe(15.0);
		livro1.exibirDadosDoLivro();
		System.out.println("");
		
		System.out.println("----------- INFORMAÇÕES AUTOR -------------");
		autor1.exibirDadosDoAutor();
		System.out.println("");
		
		System.out.println("----------- INFORMAÇÕES EDITORA -------------");
		editora1.exibirDadosEditora();
		
	}
}
