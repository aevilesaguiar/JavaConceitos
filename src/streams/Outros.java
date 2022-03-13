package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Outros {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Ana", 8.1);
		Aluno a2 = new Aluno("Ana", 8.1);
		Aluno a3 = new Aluno("Ana", 8.1);
		Aluno a4 = new Aluno("Ana", 8.1);
		Aluno a5 = new Aluno("Inez", 7.1);
		Aluno a6 = new Aluno("Ana Paula", 6.1);
		Aluno a7 = new Aluno("Cesar", 8.1);
		Aluno a8 = new Aluno("Francis", 10);
		Aluno a9 = new Aluno("Ana Paula", 6.1);
		Aluno a10 = new Aluno("Cesar", 8.1);
		Aluno a11 = new Aluno("Francis", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5,a6, a7, a8, a9,a10,a11);
		
		
		System.out.println("distinct....");
		
		alunos.stream().distinct().forEach(System.out::println);

		System.out.println("\nSkip/Limit....");//paginação dentro do stream
		alunos.stream()
		.skip(4)
		.limit(3)
		.forEach(System.out::println);
		
	
		System.out.println("\ntakeWhile....");//pegue elementos até determinada condição
		alunos.stream()
		.distinct()
		.takeWhile(a->a.nota>=7)
		.forEach(System.out::println);
		
	}

}
