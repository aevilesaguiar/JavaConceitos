package poo.heranca.desafio;

public class Teste {

	public static void main(String[] args) {

		Carro civic = new Civic();
		
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		
		System.out.println(civic);
		civic.frear();
		
		System.out.println(civic);
		
		
		
		
	Carro ferrari = new Ferrari(400);
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		
		System.out.println(ferrari);
		ferrari.frear();
		
		System.out.println(ferrari);
		
		
		Ferrari c2= new Ferrari(400);
		c2.ligarTurbo();
		
		System.out.println(c2);

	}

}
