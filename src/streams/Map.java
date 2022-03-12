package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {

		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("bMW  ", "audi ", "honda ");
		List<String> nomes = Arrays.asList("maria  ", "Fernanda ", "Flavio ", "Inez ", "Sueli ", "Gabriel");
		
		// stream() [Build operator: opera��o inicial] .map() [intermediary operator: opera��o intermedi�ria] .foreach() [fun��o terminal]
		marcas.stream().map(m->m.toUpperCase()).forEach(print);
		
		
		UnaryOperator<String> maiuscula = n-> n.toUpperCase();
		UnaryOperator<String> primeiraLetra= n->n.charAt(0)+"";
		UnaryOperator<String> grito= n->n+"!!! ";
		
		
		maiuscula.andThen(primeiraLetra).andThen(grito).apply("B");
		
		System.out.println(maiuscula.andThen(primeiraLetra).andThen(grito).apply("B"));
		
		System.out.println("\n ............Usando Composi��o............");
		marcas.stream()
			.map(maiuscula)
			.map(primeiraLetra)
			.map(grito)
			.forEach(print);
		
		
		System.out.println("\n ............Usando Composi��o usando m�todo............");
		nomes.stream()
		.map(Utilitarios.maiuscula)
		.map(primeiraLetra)
		.map(Utilitarios::grito)//metodo reference
		.forEach(print);
		
		
		
	}

}
