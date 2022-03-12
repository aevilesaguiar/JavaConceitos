package streams.desafioAluno;

public class Produto {

	final String produto;
	final double preco;
	final int quantidade;



	
	public Produto(String produto, double preco, int quantidade ) {

		this.produto = produto;
		this.preco = preco;
		this.quantidade = quantidade;


	}


	@Override
	public String toString() {
		return "[produto=" + produto + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
	
	
	
	
	
}
