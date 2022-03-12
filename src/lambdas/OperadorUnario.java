package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		// Com o Unary Operator dá para fazer encadeamento de chamadas, pois o tipo de
		// parametro que vc passa como entrada
		// é o tipo de retorno que é gerado, e pode ser passado como parametro para
		// proxima função
		// uma abordagem funcional, que tem funções focada, que faz um unico trabalho,
		// podem ser reusadas
		//interface unario será muito utilizada 

		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;

		int resultado1 = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0);

		System.out.println(resultado1);

		// compose (a leitura é o contrário, pegue zero, maisDois e e depois vezes dois.
		//apply o método que starta o processo
		int resultado2 = aoQuadrado
				.compose(vezesDois)
				.compose(maisDois)
				.apply(0);
		
		System.out.println(resultado2);

	}

}
