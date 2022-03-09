package poo.composicao.desafio;
import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	final List<Item> itens= new ArrayList<>();

	
	void adicionarItem(Produto produto, int quantidade) {
		this.itens.add(new Item(produto,quantidade));
	}

	void adicionarItem(String nome, Double preco, int quantidade) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, quantidade));
	}

	
	Double obterValorTotal() {
		Double total = (double) 0 ;
		for( Item item: this.itens) {
			total+=item.quantidade*item.produto.preco;
		}
		
		return total;
		
	}
	
}
