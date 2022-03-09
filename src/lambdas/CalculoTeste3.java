package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {

		BinaryOperator<Double> calculo = (x, y) -> {
			return x + y;
		};
		System.out.println(calculo.apply(2.0, 3.0));
 
		calculo = (x, y) -> x * y;

		System.out.println(calculo.apply(2.0, 3.0));
		
		calculo=(x,y)->x-1;
		
		System.out.println(calculo.apply(2.0, 3.0));
		
		calculo=(x,y)->x/y;
		System.out.println(calculo.apply(2.0, 3.0));
		
		
		BinaryOperator<Integer> calculoInt =(x,y)->{return x+y;};
		System.out.println(calculoInt.apply(6, 2));

		calculoInt=(x,y)->{return x-y;};
		System.out.println(calculoInt.apply(6, 2));
		
		calculoInt =(x,y)->x*y;
		System.out.println(calculoInt.apply(6, 2));

	}

}
