package lambdas;

public class Produto extends Object{

	final private String nome;
	final private Double preco;
	final private Double desconto;

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

	
	public double impostoMunicipal( double iMunicipal ) {
				
		if(this.preco>=2500) {
			 iMunicipal=this.getPreco()*(8.5/100);

		 }else {
			 iMunicipal=this.getPreco();
		 }
		return iMunicipal;
		
	}
	
	public double frete(double vFrete) {
		
		if(this.getPreco()>=3000) {
			vFrete= 100.00;
		}else {
			vFrete= 50.00;
		}
		return vFrete;
		
	}
	
	
//	public double precoRealComDesconto(double pReal) {
//		
//		pReal= impostoMunicipal()+frete()-this.desconto*this.preco; 
//		
//		
//		return pReal;
//		
//	}
	@Override
	public String toString() {
		double precoFinal = this.preco-(this.preco*this.desconto);
		return "Nome: " + nome + " \nPreço de: R$ " + preco +" \nPreço com desconto:R$ "+precoFinal +"\n............................" ;

	}

	
	
}
