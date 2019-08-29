package src.modelo;

public class Produto {
	private Integer id;
	private int codigo;
	private String nome;
	private String categoria;
	
	public Produto() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Produto (Integer id, int codigo, String nome, String categoria) {
	
		this.id = id;
		this.codigo = codigo;
		this.nome = nome;
		this.categoria = categoria;
	}

	
	public String toString() {
		return "Produto [id=" + id + ", codigo=" + codigo + ", nome=" + nome + ", categoria=" + categoria + "]";
	}
	

}
