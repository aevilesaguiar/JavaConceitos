package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Ana", 10, false);
		Aluno a2 = new Aluno("Pedro", 7.2, false);
		Aluno a3 = new Aluno("João", 5.3, true);
		Aluno a4 = new Aluno("Maria", 6.3, true);
		Aluno a5 = new Aluno("Sandra", 3.5,false);
		Aluno a6 = new Aluno("Flavio", 10, true);
		Aluno a7 = new Aluno("Inez", 10, true);
		Aluno a8 = new Aluno("Sueli", 10, true);
		Aluno a9 = new Aluno("Gabriel", 10, true);
		Aluno a10 = new Aluno("Isabella", 10, true);
		
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10);
		

		System.out.println("......................com Map e filter.........................................");
		System.out.println("......................Alunos Aprovados.........................................");	
		alunos.stream()
		.filter(a-> a.nota>=7)
		.map(a-> "Parabéns "+ a.nome+ "! Você foi aprovado(a) !" )
		.forEach(System.out::println);;
		
		
		System.out.println("................Com Predicate Function map() e filter()........................");
		System.out.println("......................Alunos Aprovados.........................................");	
		
		Predicate<Aluno> aprovado=a-> a.nota>=7 ;
		Predicate<Aluno> aprovado2=a-> a.nota>=7 && a.bomComportamento ;
		Predicate<Aluno> comportamento= a->a.bomComportamento;
		Function<Aluno, String> saudacaoAprovado=
				a-> "Parabéns " + a.nome + " ! Você foi aprovado! ";

		alunos.stream()
		.filter(aprovado)
		.filter(comportamento)
		.map(saudacaoAprovado)
		.forEach(System.out::println);


		System.out.println("......................com Map e filter.........................................");
		System.out.println("......................Alunos Reprovados.........................................");	

		alunos.stream()
		.filter(a->a.nota<7)
		.map(a-> " Infelizmente foi reprovado " + a.nome+ " sua nota foi: "+a.nota)
		.forEach(System.out::println);
		
		System.out.println("................Com Predicate Function map() e filter()........................");
		System.out.println("......................Alunos Reprovados.........................................");	
		
		Predicate<Aluno> reprovado=a->a.nota<7;
		Function<Aluno, String> sreprovado=
				a-> " Infelimente " + a.nome +" você foi Reprovado, se esforce mais!";
		alunos.stream()
		.filter(reprovado)
		.map(sreprovado)
		.forEach(System.out::println);
		
		
		
		
		
		
		
	}

}
