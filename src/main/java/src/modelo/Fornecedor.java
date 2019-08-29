package src.modelo;

public class Fornecedor {
	private Integer id;
	private String nome;
	private int cnpj;
	
	public Fornecedor() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public Fornecedor(Integer id, String nome, int cnpj) {
		
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
	}


	public String toString() {
		return "Fornecedor [id=" + id + ", nome=" + nome + ", cnpj=" + cnpj + "]";
	}

}
