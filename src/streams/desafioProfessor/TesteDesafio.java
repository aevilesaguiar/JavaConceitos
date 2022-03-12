package streams.desafioProfessor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class TesteDesafio {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Televisão 50 polegadas.....",4525.23, 0.30, 0 );
		Produto p2 = new Produto("Maquina de Lavar..........", 1100.23, 0.30, 0 );
		Produto p3 = new Produto("Sofá......................", 2525.23, 0.01, 0 );
		Produto p4 = new Produto("Microondas................",  600.23, 0.03, 20.00 );
		Produto p5 = new Produto("Guarda-Roupa..............", 1855.23, 0.01,0 );
		Produto p6 = new Produto("Ferro de Passar...........",  125.32, 0.30, 10    );
		Produto p7 = new Produto("Caderno...................",   15.32, 0.00,  5   );
		
		
		List<Produto> produtos= Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
		
		//Filter, filter, map
		Predicate<Produto> superPromocao = p ->p.getDesconto()>=0.30;
		Predicate<Produto>freteGratis   = fg ->fg.getFrete()==0;
		Predicate<Produto>produtoRelevente=pr ->pr.getPreco()>=1000;
		Function<Produto, String> respostaCompra=
				rc->"Aproveite " + rc.getNome() +" por R$ "+ rc.getPreco();
				
		produtos.stream()
		.filter(superPromocao)
		.filter(freteGratis)
		.filter(produtoRelevente)
		.map(respostaCompra)
		.forEach(System.out::println);//pipeline de execução é a sequencia de execução quando temos muitas funções
		
		

		

		
	}

}
