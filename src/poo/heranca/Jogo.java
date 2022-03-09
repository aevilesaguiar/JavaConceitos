package poo.heranca;

public class Jogo {

	public static void main(String[] args) {

		Jogador monstro = new Monstro();

		monstro.x = 10;
		monstro.y = 10;

		Jogador heroi = new Heroi(0, 0);

		heroi.x = 10;
		heroi.y = 11;
		
		
		Jogador j3= new Monstro();

		System.out.println("Monstro tem: "+monstro.vida);
		System.out.println("Herói tem: "+heroi.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);

		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		monstro.andar(Direcao.NORTE);
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		
		System.out.println("Monstro tem: "+monstro.vida);
		System.out.println("Herói tem: "+heroi.vida);
	}

}
