package poo.composicao.desafio;
import java.util.ArrayList;
import java.util.List;

import poo.composicao.Item;

public class Cliente {
	
	final String nome;
	final List<Compra> compras= new ArrayList<>();
	
	Cliente(String nome){
		this.nome=nome;
	}
	
	
	void adicionarCompra(Compra compra ) {
		this.compras.add(compra);
	}
	
	Double obterValorTotal() {
		double total=0;
		
		for(Compra comprarealizada: compras) {
			total+=comprarealizada.obterValorTotal();
		}
		
		return total;
	}



	
}
