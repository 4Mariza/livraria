package br.com.livraria.externos;

public class Autor {

	private String nome;
	private String email;
	private String cpf;

	public Autor (String cpf) {
		this.cpf = cpf;
	}
	
	public void exibirDadosDoAutor() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Email: " + this.email);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}
	
}
