package lambdas;

public class Produto extends Object{

	final private String nome;
	final private double preco;
	final private double desconto;

	public Produto(String nome, double preco, double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public double getDesconto() {
		return desconto;
	}

	@Override
	public String toString() {
		double precoFinal = this.preco-(this.preco*this.desconto);
		return "Nome: " + nome + " \nPreço de: R$ " + preco +" \nPreço com desconto:R$ "+precoFinal +"\n............................" ;

	}

	
	
}
