package entidades;

public class OrdemItem {
	
	private Integer quantidade;
	private Double preco;
	private Produto produto;

	public OrdemItem() {
		
	}

	public OrdemItem(Integer quantidade, Double preco, Produto produto) {
		super();
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double subTotal() {
		return preco*quantidade;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(produto.getNomeProduto().toUpperCase());
		sb.append(" - Quantidade: ");
		sb.append(quantidade);
		sb.append(" - Preço: ");
		sb.append(preco);
		sb.append(" - SubTotal: ");
		sb.append(subTotal());
		sb.append("\n");
		
		return sb.toString();
	}
}
