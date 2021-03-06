package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 9);
		Aluno a2 = new Aluno("Gui", 3);
		Aluno a3 = new Aluno("Fred", 5);
		Aluno a4 = new Aluno("Fla", 7.5);
		Aluno a5 = new Aluno("Inez", 10);

		
		List<Aluno> alunos= Arrays.asList(a1,a2,a3,a4,a5);
		
		Predicate<Aluno> aprovado = a-> a.nota >=7;
		Function<Aluno, Double> apenasNota = a ->a.nota;
		BinaryOperator<Double> somatorio = (a,b)-> a+b;
	
		
		//pipeline de execu??o, criar o stream, filter, reduce, map...
		
		alunos.parallelStream()
		.filter(aprovado)
		.map(apenasNota)
		.reduce(somatorio)
		.ifPresent(System.out::println);
		
	}

}
