package lambdas;

public class CalculoTeste {

	public static void main(String[] args) {
		Calculo soma = new Soma();
		Calculo multiplica = new Multiplica();
		Calculo divide = new Divisao();
		Calculo subtrai = new Subtrai();

		
		System.out.println(soma.executar(3, 2));
		System.out.println(multiplica.executar(3,2));
		System.out.println(divide.executar(3, 2));
		System.out.println(subtrai.executar(3, 2));
	
		
		
		

	}

}
