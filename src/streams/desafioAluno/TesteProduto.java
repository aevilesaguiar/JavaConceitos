package streams.desafioAluno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import streams.Aluno;

public class TesteProduto {

	public static void main(String[] args) {

		Produto p1 = new Produto("Televisão 50 polegadas", 4525.23, 10 );
		Produto p2 = new Produto("Maquina de Lavar", 1100.23, 6 );
		Produto p3 = new Produto("Sofá", 2525.23, 1 );
		Produto p4 = new Produto("Microondas", 600.23, 20 );
		Produto p5 = new Produto("Guarda-Roupa", 1855.23, 15 );
		Produto p6 = new Produto("Ferro de Passar", 125.32, 50  );

		List<Produto> lista = Arrays.asList(p1, p2, p3, p4, p5, p6);

		//System.out.println(lista);

		System.out.println("...............Lista de  Produtos em Estoque...............");

		Predicate<Produto> listaProduto= q-> q.quantidade>9 && q.preco>200.00;
		Predicate<Produto> quantidade= q->q.quantidade>2;
		Function<Produto, String> respostaCompra = 
		a-> "Adquira logo , faltam apenas " + a.quantidade + " itens desse  produto: " + a.produto;
		
		
		lista.stream()
		.filter(listaProduto)
		.filter(quantidade)
		.map(respostaCompra)
		.forEach(System.out::println);
	
	}

}
