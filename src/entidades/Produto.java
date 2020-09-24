package entidades;

public class Produto {
	
	private String nomeProduto;
	private Double preco;
	
	public Produto() {
		
	}

	public Produto(String nomeProduto, Double preco) {
		super();
		this.nomeProduto = nomeProduto;
		this.preco = preco;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	
	
}
