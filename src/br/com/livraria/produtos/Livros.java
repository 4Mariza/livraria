package br.com.livraria.produtos;

import br.com.livraria.externos.Autor;
import br.com.livraria.externos.Editora;

public class Livros {

	private String titulo;
	private String descricao;
	private double valor;
	private double valorComDesconto;
	private String isbn;
	private Autor autor;
	private Editora editora;
	private Boolean status;
	
	public Livros (String isbn, Autor autor1, Editora editora1) {
		this.isbn = isbn;
		this.autor = autor1;
		this.editora = editora1;
	}
	
	public boolean aplicarDescontoDe(double percentualDesconto) {
		
		if (percentualDesconto < 20 && valor > 85) {
			double desconto = (percentualDesconto / 100) * valor;
			valorComDesconto =  valor - desconto;
			
			status = true;
		}
		else {
			valorComDesconto = valor;
			status = false;
		}
		return status;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValorComDesconto() {
		return valorComDesconto;
	}

	public String getIsbn() {
		return isbn;
	}

	
	public void exibirDadosDoLivro() {
		System.out.println("Titulo: " + getTitulo());
		System.out.println("Descrição: " + getDescricao());
		System.out.println("Valor: " + getValor());
		System.out.println("Valor com desconto: " + getValorComDesconto());
		System.out.println("ISBN: " + getIsbn());
		System.out.println("Autor: " + autor.getNome());
		System.out.println("Editora: " + editora.getNomeFantasia());
	}
}
