package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Ana", 9.5);
		Aluno a2 = new Aluno("Gui", 10);
		Aluno a3 = new Aluno("Fred", 8.3);
		Aluno a4 = new Aluno("Fla",9.5);
		Aluno a5 = new Aluno("Inez", 10);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Predicate<Aluno> reprovado = aprovado.negate();
		
		System.out.println(alunos.stream().allMatch(aprovado));
		System.out.println(alunos.stream().anyMatch(aprovado));
		System.out.println(alunos.stream().noneMatch(aprovado));
		System.out.println(alunos.stream().noneMatch(aprovado.negate()));
		System.out.println(alunos.stream().noneMatch(reprovado));

	}

}
