package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {

		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";

		Function< String, String> oResultadoE = valor-> "O resultado �: "+ valor;
		
		Function< String, String> empolgado = valor-> valor+"!!!";
		
		Function <String, String> duvida = valor-> valor+"??";
		
		
		//.andThem significa andThen= e ent�o;
		
		String resultadoFinal = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.andThen(duvida)
				.apply(32);

		
		System.out.println(resultadoFinal);
		System.out.println(parOuImpar.apply(33));
	}

}
