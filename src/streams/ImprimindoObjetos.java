package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;


public class ImprimindoObjetos {

	public static void main(String[] args) {
		
		int indice=0;

		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
		
		List<String> biblioteca=Arrays.asList("Código Limpo", "Arquitetura limpa", "Java efetivo"+"Shell Linux");

		System.out.println("................Usando for......................");
		
		for(int i=0; i<aprovados.size();i++) {
			
			System.out.println("Nome "+ (i+1) + " : "+aprovados.get(i));
			
		}
		
		
		System.out.println("..............Usando foreach...................");
		
		for (String nome : aprovados) {
			
			System.out.println("Nome "+ (indice+1) + " : "+nome);
		
			indice+=1;
		}
		
		
		System.out.println("..............Usando Iterator...................");
		
		Iterator<String> it= aprovados.iterator();
		while(it.hasNext()) {
			System.out.println("Nome: "+it.next());
		}
		
		System.out.println(".......... Outro Usando Iterator...............");
		
		Iterator<String >lista = biblioteca.iterator();
		
		//controla o laço usando o while
		while(lista.hasNext()) {
			System.out.println("Livro: "+ lista.next());
		}
		
		System.out.println("............. Usando Stream..................");
		
		Stream<String> st = aprovados.stream();
		st.forEach(System.out::println);//laço interno, importante pois parte do trabalho é feita pela própria linguagem
		
	}

}
