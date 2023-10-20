package br.com.livraria.externos;

public class Editora {

	private String nomeFantasia;
	private String razaoSocial;
	private String cnpj;
	
	public Editora(String razaoSocial, String cnpj) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}
	
	public void exibirDadosEditora() {
		System.out.println("Nome Fantasia: " + this.nomeFantasia);
		System.out.println("Razão Social: " + this.razaoSocial);
		System.out.println("CNPJ: " + this.cnpj);
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}
	
	
}
