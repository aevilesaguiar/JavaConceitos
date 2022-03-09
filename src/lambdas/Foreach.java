package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Ana", "Bia", "Pedro", "Lara");

		List<String> pessoas = Arrays.asList("Anne", "Flavio", "Aeviles", "Inez", "Ivanilde");

		System.out.println("Forma Tradicional");
		for (String nome : aprovados) {

			System.out.println(nome);
		}

		System.out.println("\nLambda #01...");

		aprovados.forEach((nome) -> {
			System.out.println(nome + "!!!!");
		});

		System.out.println("\nLambda simplificando...");
		aprovados.forEach(nome -> System.out.println(nome + "!!!!"));

		System.out.println("\nMetodo Reference #01...");

		aprovados.forEach(System.out::println);

		System.out.println("\n outro caso Metodo Reference");
		pessoas.forEach(System.out::println);

		System.out.println("\nLambda #02...");

		aprovados.forEach((nome) -> meuImprimir(nome));

		System.out.println("\nMetodo Reference #2...");

		aprovados.forEach(Foreach::meuImprimir);
	

	}

	static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome é " + nome);
	}

}
