package poo.encapsulamento.casaB;

import poo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	void testeAcessos() {
		//	private  segredo 
		//	pacote(s� ser� acessado se estiver no mesmo pacote) facoDentroDeCasa 
		//	protected(O atributo protected s� ser� acessado via heran�a) formaDeFalar 
		//	public todosSabem 
			
			
			// System.out.println(segredo);
			//System.out.println(facoDentroDeCasa);
			System.out.println(formaDeFalar);
			System.out.println(todosSabem);
			
			
		}
	
	
}
