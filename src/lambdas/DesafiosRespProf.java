package lambdas;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafiosRespProf {

	public static void main(String[] args) {
		
		/*Interfaces Funcionais*/

		/*
		 * 1. A partir do produto calcular o preço real (com desconto) 2. iMPOSTO
		 * mUNICIPAL: >= 2500(8,5%)/<2500(ISENTO) 3. Frete: >= 3000(100)/<3000(50)
		 * 4.Arredondar: Deixar duas casas decimais 5. Formatar: R$1234,56
		 */
		//1
		Function<Produto, Double> precoFinal = 
				produto-> produto.getPreco()*(1-produto.getDesconto());
			
		//2
		UnaryOperator<Double> impostoMunicipal =
				preco-> preco>=2500 ? preco*1.085:preco ;
		//3
		UnaryOperator<Double> frete=
				preco-> preco>=3000? preco+100: preco+50 ;
		//4
		UnaryOperator<Double> arredondar = 
				preco -> Double.parseDouble(String.format(Locale.ENGLISH, "%.2f", preco));		
		
		
		Function<Double, String> formatar=
				preco-> ("R$" + preco).replace(".",",");
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		
		System.out.println("O preço final é "+ preco);
		
		
	
	}

}
