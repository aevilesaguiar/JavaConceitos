import java.util.function.Predicate;

import lambdas.Produto;

public class Predicado {

	public static void main(String[] args) {

		//verificar se verdadeiro e falso
		Predicate<Produto> isCaro= prod->(prod.getPreco()*(1-prod.getDesconto()))>=750;
		
		Produto produto = new Produto("Notebook", 3893.89, 0.15);
		
		
		System.out.println(isCaro.test(produto));
		
	}

}
