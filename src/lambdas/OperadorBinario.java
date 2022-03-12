package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		// lambda calcular duas notas

		BinaryOperator<Double> media = (Double n1, Double n2) -> (n1 + n2) / 2;

		System.out.println(media.apply(9.8, 5.7));

		BiFunction<Double, Double, String> resultado = (Double n1, Double n2) ->{
			Double notaFinal = (n1 + n2) / 2 ;
					return notaFinal >=7?"Aprovado":"Reprovado";
		} ;//sentença de código termina com ;
		
		System.out.println(resultado.apply(9.7, 5.0));
		System.out.println(resultado.apply(9.7, 2.0));
		
		
		Function<Double, String> conceito = m-> m>=7?"Aprovado":"Reprovado";
		
		System.out.println(media.andThen(conceito).apply(2.0, 5.1));

	}

}
