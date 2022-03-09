package poo.composicao.desafio;

public class JavaTeste {

	public static void main(String[] args) {
		

		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 15.65,100);
		compra1.adicionarItem(new Produto("Notebook", 1899.11),10);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 10.02,1);
		compra2.adicionarItem(new Produto("Impressora", 399.11),10);
		
		
		Cliente cliente = new Cliente("Flavio Tavares");
		cliente.compras.add(compra1);
		cliente.adicionarCompra(compra2);
		
		
		System.out.println(cliente.obterValorTotal());
		
		
		
	}

}
