package poo.encapsulamento.casaB;

import poo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	void testeAcessos() {
		//	private  segredo 
		//	pacote(só será acessado se estiver no mesmo pacote) facoDentroDeCasa 
		//	protected(O atributo protected só será acessado via herança) formaDeFalar 
		//	public todosSabem 
			
			
			// System.out.println(segredo);
			//System.out.println(facoDentroDeCasa);
			System.out.println(formaDeFalar);
			System.out.println(todosSabem);
			
			
		}
	
	
}
