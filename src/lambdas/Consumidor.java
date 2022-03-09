package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		Consumer< Produto> imprimir = p->System.out.println(p.getNome() +" Preço: "+p.getPreco());
		Produto p1 = new Produto("Caneta", 12.35, 0.09);
		
		Produto p2 = new Produto("Notebook", 2987.99, 0.09);
		Produto p3 = new Produto("Caderno", 19.90, 0.09);
		Produto p4 = new Produto("Lapis", 1.34, 0.09);
		Produto p5 = new Produto("Borracha", 12.34, 0.09);
	
		
		imprimir.accept(p1);
		
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);
		
		produtos.forEach(imprimir );
		
		produtos.forEach(prod->System.out.println(prod.getPreco()));
		
		produtos.forEach(System.out::println);
	}

}
