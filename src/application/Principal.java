package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Ordem;
import entidades.OrdemItem;
import entidades.Produto;
import enums.OrdemStatus;

public class Principal {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
		
		System.out.println("** DADOS DO CLIENTE **");
		System.out.print("Nome: ");
			String nomeCliente = sc.nextLine();
		System.out.print("Email: ");
			String emailCliente = sc.nextLine();
		System.out.print("Data de Nascimento: (DD/MM/YYYY) ");
			Date dataNascimento = sdf.parse(sc.next());
		sc.nextLine();
		
/******* Instanciar o novo Cliente *********************************************/
		Cliente cliente = new Cliente(nomeCliente.toUpperCase(), emailCliente, dataNascimento);
		

/******* Coleta de Dados do Pedido!!! *****************************************/
		System.out.println("DADOS DO PEDIDO");
		System.out.print("Status: ");
		OrdemStatus status = OrdemStatus.valueOf(sc.next().toUpperCase());
		
		
/******* Gerando uma Nova Ordem *****************************************/		
		Ordem ordem = new Ordem(new Date(), status, cliente);
		

/******* Itens do Pedido *****************************************/		
		System.out.print("Quantos Itens irá adicionar na lista? ");
		int q = sc.nextInt();
		
			for (int i = 1; i<=q; i++) {
				System.out.println("Dados do item #"+i);
				System.out.print("Nome do Produto: ");
				sc.nextLine();
				String nomeProduto = sc.nextLine();
				System.out.print("Preço do Produto: ");
				Double precoProduto = sc.nextDouble();
/******* Instanciando um Novo Produto*****************************/			
				Produto produto = new Produto(nomeProduto, precoProduto);
			
				System.out.print("Quantidade: ");
				Integer quantProduto = sc.nextInt();
			
/******* Instanciando um Novo Item do tipo OrdemItem  ************/
				OrdemItem item = new OrdemItem(quantProduto, precoProduto, produto);
			
				ordem.addItem(item);
				System.out.println();
					
			}
		sc.close();
		traco();
		System.out.println("RELATÓRIO!");
		System.out.println("Data da Ordem: " + sdf2.format(ordem.getMomento()));
		System.out.println("Status da Ordem: " + status);
		System.out.println(
					    "Cliente: " + cliente.getNome() 
						+ " (" + sdf.format(cliente.getNascimento()) + ")"
						+ " - " + cliente.getEmail()
						);
		System.out.println("Itens!");
		System.out.println(ordem);
		System.out.println("Total: " + ordem.Total());
	}

	public static void traco() {
		for(int i=0; i<=50; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	
	
}
