package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {

		Consumer<String> print = System.out::print;
		Consumer<Integer> printNumber = System.out::println;
		
		//metodo estatico da propria linguage,stream.of
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS \n");
		langs.forEach(print);
		
		//array de string
		String[] maisLangs = {"Python ", "Lisp(ling funcional) ", "Perl(ling script) ", "Go( ling google subs processo mais pesado) \n" };

		//criar string através de array
		Stream.of(maisLangs).forEach(print);
		
		Arrays.stream(maisLangs).forEach(print);
		
		Arrays.stream(maisLangs, 1 , 4 ).forEach(print);
		
		//a partir das Collections dá para gerar streams
		
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin \n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);//STREAM DE FORMA PARAALELA NÃO NECESSARIAMENTE SEGUINDO A ORDEM DA LISTA 
		
		//método chamado generate() gera um stream de forma infinita, sem ordenação 
		
		//Stream.generate(()-> "a").forEach(print);
		//gera uma string infinita com ordenação
		//Stream.iterate(0, n->n+1).forEach(printNumber);
	}

}
