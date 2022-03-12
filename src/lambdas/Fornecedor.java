package lambdas;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.List;

public class Fornecedor {

	public static void main(String[] args) {
		// interface que não recebe nenhum parametro e retorna alguma coisa
		//interface funcional, forçado a colocar os parenteses
		
		Supplier<List <String> > umaLista = () -> Arrays.asList("Ana", "Bia", "Gui");
		
		System.out.println(umaLista.get());
		
	Supplier<List <Object> > umaLista2 = () -> Arrays.asList("Flavio", "Inez", "Isabella");
		
		System.out.println(umaLista2.get());


	}

}
