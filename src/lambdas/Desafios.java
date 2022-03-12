package lambdas;

import java.math.BigDecimal;

public class Desafios {

	public static void main(String[] args) {

 Produto p = new Produto("iPad", 3235.89, 0.13);
 
 /*
  * 1. A partir do produto calcular o preço real (com desconto)
  * 2. iMPOSTO mUNICIPAL: >= 2500(8,5%)/<2500(ISENTO)
  * 3. Frete: >= 3000(100)/<3000(50)
  * 4.Arredondar: Deixar duas casas decimais
  * 5. Formatar: R$1234,56
  * */

 
 double desconto=p.getPreco()*p.getDesconto();
 System.out.println("Desconto: "+desconto);
 
 System.out.println("Imposto Municipal: "+p.impostoMunicipal(p.getPreco()));

System.out.println("Frete: "+p.frete(p.getPreco()));

double precoReal = p.getPreco()+p.frete(p.getPreco()+p.impostoMunicipal(p.getPreco())-desconto);

System.out.println("Preço real: R$ "+precoReal);
 
	}

}
