package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enums.OrdemStatus;

public class Ordem {
	
	private Date momento;
	private OrdemStatus status;
	
	private Cliente cliente;
	
	List<OrdemItem> itens = new ArrayList<>();
	
	public Ordem () {
		
	}

	public Ordem(Date momento, OrdemStatus status, Cliente cliente) {
		super();
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public OrdemStatus getStatus() {
		return status;
	}

	public void setStatus(OrdemStatus status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<OrdemItem> getItens() {
		return itens;
	}

	public void setItens(List<OrdemItem> itens) {
		this.itens = itens;
	}
	
	public void addItem(OrdemItem item) {
		itens.add(item);
	}

	public double Total() {
		double soma=0;
		for (OrdemItem c: itens) {
			
			/* 
			* no Objeto/Lista OrdemItem, a variavel corresponde para o registro
			* atual OrdemItem C: itens é o nome do objeto que foi atribuido:
			* List<OrdemItem> itens = new .....
			* onde ** c.subTotal(); **
			* corresponde ao subtotal do registro atual!
			*
			*/

			soma = soma + c.subTotal();
		}
		return soma;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();		
		for(OrdemItem c: itens) {
			sb.append(c.toString());
		}	
		
		return sb.toString();
	}
}

